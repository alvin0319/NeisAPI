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
package me.alvin0319.neisapi.school.meal

import me.alvin0319.neisapi.NeisAPI
import java.util.Date

data class Meal @JvmOverloads constructor(
    // 날짜
    var date: Date,
    // 아침
    var breakfast: String = "없음",
    // 점심
    var lunch: String = "없음",
    // 저녁
    var dinner: String = "없음"
) : Cloneable {

    public override fun clone(): Meal {
        return Meal(date, breakfast, lunch, dinner)
    }

    fun removeAllergy(type: MealType): String {
        return NeisAPI.removeAllergy(
            when (type.name) {
                "BREAKFAST" -> breakfast
                "LUNCH" -> lunch
                "DINNER" -> dinner
                else -> throw IllegalArgumentException("Invalid MealType ${type.name} given")
            }
        )
    }

    companion object {
        fun parseMonth(monthStr: String, year: Int, month: Int): Meal {
            val date = Date()
            val charSplited = monthStr.split("<br />").toMutableList()

            if (monthStr.length < 3) {
                return Meal(date, "없음", "없음", "없음")
            }

            date.month = month
            date.year = year - 1900
            date.date = charSplited.removeFirst().toInt()

            var mealString: String
            val mealList: List<String> = listOf("[조식]", "[중식]", "[석식]")

            val meals: MutableMap<String, MutableList<String>> = mutableMapOf()

            meals[mealList[0]] = mutableListOf()
            meals[mealList[1]] = mutableListOf()
            meals[mealList[2]] = mutableListOf()

            if (mealList.contains(charSplited[0])) {
                mealString = charSplited.removeFirst()
            } else {
                return Meal(date)
            }
            var currentString: String
            while (charSplited.isNotEmpty()) {
                currentString = charSplited.removeFirst()
                if (mealList.contains(currentString)) {
                    mealString = currentString
                    continue
                }
                meals[mealString]!!.add(currentString)
            }
            return Meal(
                date,
                meals[mealList[0]]?.joinToString(", ") ?: "없음",
                meals[mealList[1]]?.joinToString(", ") ?: "없음",
                meals[mealList[2]]?.joinToString(", ") ?: "없음"
            )
        }
    }
}
