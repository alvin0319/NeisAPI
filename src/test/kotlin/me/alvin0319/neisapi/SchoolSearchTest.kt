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
package me.alvin0319.neisapi

import me.alvin0319.neisapi.school.SchoolSearched
import me.alvin0319.neisapi.types.SchoolDistrictList

fun main(args: Array<String>) {
    val schoolName = "고등학교"

    val edu = SchoolDistrictList.ALL

    val start = System.currentTimeMillis()

    val result = SchoolSearched.search(schoolName, edu, true)

    val end = System.currentTimeMillis()

    println("총 ${result.size}개의 결과를 찾는데 ${end - start}ms가 걸렸습니다.")
    result.forEach {
        println("=== ${it.name} ===")
        println("학교 소재지: ${it.address}")
        println("학교 종류: ${it.kind.name}")
        println("교육청: ${it.edu.name}")
        println("학교 코드: ${it.code}")
    }
}
