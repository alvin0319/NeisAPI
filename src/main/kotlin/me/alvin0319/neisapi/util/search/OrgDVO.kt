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
package me.alvin0319.neisapi.util.search

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import javax.annotation.Generated

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder(
    "atptOfcdcNm",
    "atptOfcdcOrgCode",
    "data",
    "flag",
    "kraOrgNm",
    "orgCode",
    "requestSenderID",
    "requestTargetAction",
    "schulCrseScCode",
    "schulCrseScCodeNm",
    "schulKndScCode",
    "sqlAction",
    "terminalType",
    "transactionID",
    "zipAdres"
)
@Generated("jsonschema2pojo")
@JsonIgnoreProperties(ignoreUnknown = true)
data class OrgDVO constructor(
    @get:JsonProperty("atptOfcdcNm")
    @set:JsonProperty("atptOfcdcNm")
    @JsonProperty("atptOfcdcNm")
    var atptOfcdcNm: String? = null,
    @get:JsonProperty("atptOfcdcOrgCode")
    @set:JsonProperty("atptOfcdcOrgCode")
    @JsonProperty("atptOfcdcOrgCode")
    var atptOfcdcOrgCode: String? = null,
    @get:JsonProperty("data")
    @set:JsonProperty("data")
    @JsonProperty("data")
    var data: Data? = null,
    @get:JsonProperty("flag")
    @set:JsonProperty("flag")
    @JsonProperty("flag")
    var flag: String? = null,
    @get:JsonProperty("kraOrgNm")
    @set:JsonProperty("kraOrgNm")
    @JsonProperty("kraOrgNm")
    var kraOrgNm: String? = null,
    @get:JsonProperty("orgCode")
    @set:JsonProperty("orgCode")
    @JsonProperty("orgCode")
    var orgCode: String? = null,
    @get:JsonProperty("requestSenderID")
    @set:JsonProperty("requestSenderID")
    @JsonProperty("requestSenderID")
    var requestSenderID: String? = null,
    @get:JsonProperty("requestTargetAction")
    @set:JsonProperty("requestTargetAction")
    @JsonProperty("requestTargetAction")
    var requestTargetAction: String? = null,
    @get:JsonProperty("schulCrseScCode")
    @set:JsonProperty("schulCrseScCode")
    @JsonProperty("schulCrseScCode")
    var schulCrseScCode: String? = null,
    @get:JsonProperty("schulCrseScCodeNm")
    @set:JsonProperty("schulCrseScCodeNm")
    @JsonProperty("schulCrseScCodeNm")
    var schulCrseScCodeNm: String? = null,
    @get:JsonProperty("schulKndScCode")
    @set:JsonProperty("schulKndScCode")
    @JsonProperty("schulKndScCode")
    var schulKndScCode: String? = null,
    @get:JsonProperty("sqlAction")
    @set:JsonProperty("sqlAction")
    @JsonProperty("sqlAction")
    var sqlAction: String? = null,
    @get:JsonProperty("terminalType")
    @set:JsonProperty("terminalType")
    @JsonProperty("terminalType")
    var terminalType: String? = null,
    @get:JsonProperty("transactionID")
    @set:JsonProperty("transactionID")
    @JsonProperty("transactionID")
    var transactionID: String? = null,
    @get:JsonProperty("zipAdres")
    @set:JsonProperty("zipAdres")
    @JsonProperty("zipAdres")
    var zipAdres: String? = null,

)
