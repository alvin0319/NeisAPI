package me.alvin0319.neisapi.school

import me.alvin0319.neisapi.school.meal.MealType
import me.alvin0319.neisapi.types.SchoolDistrictList
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class SchoolMealTest {

    @Test
    fun testGetMeal() {
        val schoolName = "동래고등학교"
        val edu = SchoolDistrictList.ALL
        val result = SchoolSearch.search(schoolName, edu, true)
        assert(result.isNotEmpty())

        val school = result[0]
        val year = 2021
        val month = 4

        val meals = SchoolMeal.getMeal(school, year, month)
        assert(meals.isNotEmpty())
        assertEquals(meals.size, 17)

//        meals.forEach { (_, meal) ->
//            println("=== ${school.name} ${meal.date.year + 1900}년 ${meal.date.month}월 ${meal.date.date}일 급식 ===")
//            println("조식: ${meal.removeAllergy(MealType.BREAKFAST)}")
//            println("중식: ${meal.removeAllergy(MealType.LUNCH)}")
//            println("석식: ${meal.removeAllergy(MealType.DINNER)}")
//        }
    }
}