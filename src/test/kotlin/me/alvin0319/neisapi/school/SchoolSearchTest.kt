package me.alvin0319.neisapi.school

import me.alvin0319.neisapi.types.SchoolDistrictList
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class SchoolSearchTest {

    @Test
    fun testSearchAllSchool() {
        val expectSize = 2345

        val schoolName = "고등학교"
        val edu = SchoolDistrictList.ALL
        val result = SchoolSearch.search(schoolName, edu, true)
        assert(result.isNotEmpty())
        assertEquals(result.size, expectSize)
    }

    @Test
    fun testSearchSchool() {
        val schoolName = "동래고등학교"
        val edu = SchoolDistrictList.ALL
        val result = SchoolSearch.search(schoolName, edu, true)
        assert(result.isNotEmpty())
    }
}