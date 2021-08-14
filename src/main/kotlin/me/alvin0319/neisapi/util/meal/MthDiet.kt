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
package me.alvin0319.neisapi.util.meal

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import javax.annotation.Generated

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder(
    "sqlAction",
    "weekGb",
    "sun",
    "mon",
    "tue",
    "wed",
    "the",
    "fri",
    "sat",
    "insttCode",
    "beginYmd",
    "endYmd",
    "mmealScNm",
    "mmealScCode",
    "seq",
    "tmp",
    "reqGb",
    "orplcMngPrdlNm",
    "orplcCntryNm1",
    "orplcCntryNm2",
    "orplcCntryNm3",
    "orplcCntryNm4",
    "orplcCntryNm5",
    "orplcCntryNm6",
    "orplcCntryNm7",
    "sort",
    "gb",
    "dy1",
    "dy2",
    "dy3",
    "dy4",
    "dy5",
    "dy6",
    "dy7",
    "dy8",
    "dy9",
    "dy10",
    "dy11"
)
@Generated("jsonschema2pojo")
@JsonIgnoreProperties(ignoreUnknown = true)
data class MthDiet(
    @get:JsonProperty("sqlAction")
    @set:JsonProperty("sqlAction")
    @JsonProperty("sqlAction")
    var sqlAction: Any? = null,
    @get:JsonProperty("weekGb")
    @set:JsonProperty("weekGb")
    @JsonProperty("weekGb")
    var weekGb: String? = null,
    @get:JsonProperty("sun")
    @set:JsonProperty("sun")
    @JsonProperty("sun")
    var sun: String? = null,
    @get:JsonProperty("mon")
    @set:JsonProperty("mon")
    @JsonProperty("mon")
    var mon: String? = null,
    @get:JsonProperty("tue")
    @set:JsonProperty("tue")
    @JsonProperty("tue")
    var tue: String? = null,
    @get:JsonProperty("wed")
    @set:JsonProperty("wed")
    @JsonProperty("wed")
    var wed: String? = null,
    @get:JsonProperty("the")
    @set:JsonProperty("the")
    @JsonProperty("the")
    var the: String? = null,
    @get:JsonProperty("fri")
    @set:JsonProperty("fri")
    @JsonProperty("fri")
    var fri: String? = null,
    @get:JsonProperty("sat")
    @set:JsonProperty("sat")
    @JsonProperty("sat")
    var sat: String? = null,
    @get:JsonProperty("insttCode")
    @set:JsonProperty("insttCode")
    @JsonProperty("insttCode")
    var insttCode: Any? = null,
    @get:JsonProperty("beginYmd")
    @set:JsonProperty("beginYmd")
    @JsonProperty("beginYmd")
    var beginYmd: Any? = null,
    @get:JsonProperty("endYmd")
    @set:JsonProperty("endYmd")
    @JsonProperty("endYmd")
    var endYmd: Any? = null,
    @get:JsonProperty("mmealScNm")
    @set:JsonProperty("mmealScNm")
    @JsonProperty("mmealScNm")
    var mmealScNm: Any? = null,
    @get:JsonProperty("mmealScCode")
    @set:JsonProperty("mmealScCode")
    @JsonProperty("mmealScCode")
    var mmealScCode: Any? = null,
    @get:JsonProperty("seq")
    @set:JsonProperty("seq")
    @JsonProperty("seq")
    var seq: Any? = null,
    @get:JsonProperty("tmp")
    @set:JsonProperty("tmp")
    @JsonProperty("tmp")
    var tmp: Any? = null,
    @get:JsonProperty("reqGb")
    @set:JsonProperty("reqGb")
    @JsonProperty("reqGb")
    var reqGb: Any? = null,
    @get:JsonProperty("orplcMngPrdlNm")
    @set:JsonProperty("orplcMngPrdlNm")
    @JsonProperty("orplcMngPrdlNm")
    var orplcMngPrdlNm: Any? = null,
    @get:JsonProperty("orplcCntryNm1")
    @set:JsonProperty("orplcCntryNm1")
    @JsonProperty("orplcCntryNm1")
    var orplcCntryNm1: Any? = null,
    @get:JsonProperty("orplcCntryNm2")
    @set:JsonProperty("orplcCntryNm2")
    @JsonProperty("orplcCntryNm2")
    var orplcCntryNm2: Any? = null,
    @get:JsonProperty("orplcCntryNm3")
    @set:JsonProperty("orplcCntryNm3")
    @JsonProperty("orplcCntryNm3")
    var orplcCntryNm3: Any? = null,
    @get:JsonProperty("orplcCntryNm4")
    @set:JsonProperty("orplcCntryNm4")
    @JsonProperty("orplcCntryNm4")
    var orplcCntryNm4: Any? = null,
    @get:JsonProperty("orplcCntryNm5")
    @set:JsonProperty("orplcCntryNm5")
    @JsonProperty("orplcCntryNm5")
    var orplcCntryNm5: Any? = null,
    @get:JsonProperty("orplcCntryNm6")
    @set:JsonProperty("orplcCntryNm6")
    @JsonProperty("orplcCntryNm6")
    var orplcCntryNm6: Any? = null,
    @get:JsonProperty("orplcCntryNm7")
    @set:JsonProperty("orplcCntryNm7")
    @JsonProperty("orplcCntryNm7")
    var orplcCntryNm7: Any? = null,
    @get:JsonProperty("sort")
    @set:JsonProperty("sort")
    @JsonProperty("sort")
    var sort: Any? = null,
    @get:JsonProperty("gb")
    @set:JsonProperty("gb")
    @JsonProperty("gb")
    var gb: Any? = null,
    @get:JsonProperty("dy1")
    @set:JsonProperty("dy1")
    @JsonProperty("dy1")
    var dy1: Any? = null,
    @get:JsonProperty("dy2")
    @set:JsonProperty("dy2")
    @JsonProperty("dy2")
    var dy2: Any? = null,
    @get:JsonProperty("dy3")
    @set:JsonProperty("dy3")
    @JsonProperty("dy3")
    var dy3: Any? = null,
    @get:JsonProperty("dy4")
    @set:JsonProperty("dy4")
    @JsonProperty("dy4")
    var dy4: Any? = null,
    @get:JsonProperty("dy5")
    @set:JsonProperty("dy5")
    @JsonProperty("dy5")
    var dy5: Any? = null,
    @get:JsonProperty("dy6")
    @set:JsonProperty("dy6")
    @JsonProperty("dy6")
    var dy6: Any? = null,
    @get:JsonProperty("dy7")
    @set:JsonProperty("dy7")
    @JsonProperty("dy7")
    var dy7: Any? = null,
    @get:JsonProperty("dy8")
    @set:JsonProperty("dy8")
    @JsonProperty("dy8")
    var dy8: Any? = null,
    @get:JsonProperty("dy9")
    @set:JsonProperty("dy9")
    @JsonProperty("dy9")
    var dy9: Any? = null,
    @get:JsonProperty("dy10")
    @set:JsonProperty("dy10")
    @JsonProperty("dy10")
    var dy10: Any? = null,
    @get:JsonProperty("dy11")
    @set:JsonProperty("dy11")
    @JsonProperty("dy11")
    var dy11: Any? = null
)
