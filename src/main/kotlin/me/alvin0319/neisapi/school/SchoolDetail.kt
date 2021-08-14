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

import me.alvin0319.neisapi.types.SchoolDistrictList
import me.alvin0319.neisapi.types.SchoolFoundType
import me.alvin0319.neisapi.types.SchoolGenderType
import me.alvin0319.neisapi.types.SchoolType
import java.util.Date

// TODO
class SchoolDetail(
    edu: SchoolDistrictList,
    code: String,
    kind: SchoolType,
    name: String,
    address: String,
    val foundDate: Date,
    val zipCode: String,
    val tell: String,
    val fax: String,
    val homepage: String,
    val genderType: SchoolGenderType,
    val foundType: SchoolFoundType,
    val teachers: Int
) : SchoolSearched(edu, code, kind, name, address)
