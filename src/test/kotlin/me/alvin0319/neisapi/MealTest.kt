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
import me.alvin0319.neisapi.school.meal.Meal
import me.alvin0319.neisapi.school.meal.MealType
import me.alvin0319.neisapi.types.SchoolDistrictList

class MealTest {
    fun start() {
        val schoolName = "고등학교"

        val edu = SchoolDistrictList.ALL

        val start = System.currentTimeMillis()

        val result = SchoolSearched.search(schoolName, edu, true)

        val end = System.currentTimeMillis()

        println("총 ${result.size}개의 결과를 찾는데 ${end - start}ms가 걸렸습니다.")
        if (result.isEmpty()) {
            println("학교 검색에 실패했습니다.")
            return
        }

        val school = result.toMutableList().removeFirst()

        val year = 2021
        val month = 4

        // 캐시 X 테스트
        val meals = Meal.getMeal(school, year, month)

        meals.forEach { (_, meal) ->
            println("=== ${school.name} ${meal.date.year}년 ${meal.date.month}월 ${meal.date.date}일 급식 ===")
            println("조식: ${meal.removeAllergy(MealType.BREAKFAST)}")
            println("중식: ${meal.removeAllergy(MealType.LUNCH)}")
            println("석식: ${meal.removeAllergy(MealType.DINNER)}")
        }
        // 캐시 테스트
        Meal.getMeal(school, year, month).forEach { (_, meal) ->
            println("=== ${school.name} ${meal.date.year}년 ${meal.date.month}월 ${meal.date.date}일 급식 ===")
            println("조식: ${meal.removeAllergy(MealType.BREAKFAST)}")
            println("중식: ${meal.removeAllergy(MealType.LUNCH)}")
            println("석식: ${meal.removeAllergy(MealType.DINNER)}")
        }
    }
}

fun main(args: Array<String>) {
    MealTest().start()
}
