/*
 * MIT License
 *
 * Copyright (c) 2021 alvin0319
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package me.alvin0319.neisapi.school

import com.fasterxml.jackson.databind.ObjectMapper
import me.alvin0319.neisapi.request.Request
import me.alvin0319.neisapi.types.SchoolDistrictList
import me.alvin0319.neisapi.types.SchoolType
import me.alvin0319.neisapi.util.search.DataBody

object SchoolSearch {
    @JvmStatic
    val result: MutableMap<SchoolDistrictList, MutableMap<String, MutableList<SchoolSearched>>> = mutableMapOf()

    @JvmOverloads
    @JvmStatic
    fun search(name: String, edu: SchoolDistrictList, refresh: Boolean = false): List<SchoolSearched> {
        if (result.getOrPut(edu) { mutableMapOf() }.containsKey(name) && !refresh) {
            return result[edu]?.get(name)!!
        }
        return fetchData(name, edu)
    }

    private fun searchResults(name: String, code: SchoolDistrictList): MutableList<SchoolSearched> {
        val response = Request.createRequest(
            "spr_ccm_cm01_100.ws", code,
            mapOf(
                "kraOrgNm" to name
            )
        )
        if (response.statusLine.statusCode != 200) {
            return mutableListOf()
        }
        val body = response.entity.content.readAllBytes().decodeToString()

        val mapper = ObjectMapper()

        val searchResult = mapper.readValue(body, DataBody::class.java)

        val searchedList: MutableList<SchoolSearched> = mutableListOf()

        if (searchResult.result?.status != "success") {
            return searchedList
        }

        searchResult.resultSVO?.orgDVOList?.forEach {
            searchedList.add(
                SchoolSearched(
                    code,
                    it.orgCode ?: "",
                    SchoolType.fromInt(it.schulCrseScCode?.uppercase() ?: "2"),
                    it.kraOrgNm ?: "",
                    it.zipAdres ?: "주소를 찾을 수 없습니다."
                )
            )
        }
        return searchedList
    }

    private fun fetchData(name: String, edu: SchoolDistrictList): List<SchoolSearched> {
        val complete: MutableList<SchoolSearched> = mutableListOf()
        return if (edu == SchoolDistrictList.ALL) {
            SchoolDistrictList.values().forEach {
                if (it != SchoolDistrictList.ALL) {
                    searchResults(name, it).forEach { res ->
                        complete.add(res)
                    }
                }
            }
            complete
        } else {
            result.getOrPut(edu) { mutableMapOf() }[name] = searchResults(name, edu)
            result[edu]?.get(name)!!
        }
    }
}
