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
    "flag",
    "svcId",
    "voId",
    "method",
    "userId",
    "ip",
    "resultCode",
    "resultMsg",
    "comData",
    "dept",
    "lang",
    "useSession",
    "commitYn",
    "testExeSeq",
    "globCorpCd",
    "kraOrgNm",
    "insttClsfCode",
    "fondScCode",
    "srCode",
    "atptOfcdcScCode",
    "orgDVOList"
)
@Generated("jsonschema2pojo")
@JsonIgnoreProperties(ignoreUnknown = true)
data class ResultSVO constructor(
    @get:JsonProperty("flag")
    @set:JsonProperty("flag")
    @JsonProperty("flag")
    var flag: String? = null,
    @get:JsonProperty("svcId")
    @set:JsonProperty("svcId")
    @JsonProperty("svcId")
    var svcId: String? = null,
    @get:JsonProperty("voId")
    @set:JsonProperty("voId")
    @JsonProperty("voId")
    var voId: String? = null,
    @get:JsonProperty("method")
    @set:JsonProperty("method")
    @JsonProperty("method")
    var method: String? = null,
    @get:JsonProperty("userId")
    @set:JsonProperty("userId")
    @JsonProperty("userId")
    var userId: String? = null,
    @get:JsonProperty("ip")
    @set:JsonProperty("ip")
    @JsonProperty("ip")
    var ip: String? = null,
    @get:JsonProperty("resultCode")
    @set:JsonProperty("resultCode")
    @JsonProperty("resultCode")
    var resultCode: String? = null,
    @get:JsonProperty("resultMsg")
    @set:JsonProperty("resultMsg")
    @JsonProperty("resultMsg")
    var resultMsg: String? = null,
    @get:JsonProperty("comData")
    @set:JsonProperty("comData")
    @JsonProperty("comData")
    var comData: ComData? = null,
    @get:JsonProperty("dept")
    @set:JsonProperty("dept")
    @JsonProperty("dept")
    var dept: String? = null,
    @get:JsonProperty("lang")
    @set:JsonProperty("lang")
    @JsonProperty("lang")
    var lang: String? = null,
    @get:JsonProperty("useSession")
    @set:JsonProperty("useSession")
    @JsonProperty("useSession")
    var useSession: String? = null,
    @get:JsonProperty("commitYn")
    @set:JsonProperty("commitYn")
    @JsonProperty("commitYn")
    var commitYn: String? = null,
    @get:JsonProperty("testExeSeq")
    @set:JsonProperty("testExeSeq")
    @JsonProperty("testExeSeq")
    var testExeSeq: String? = null,
    @get:JsonProperty("globCorpCd")
    @set:JsonProperty("globCorpCd")
    @JsonProperty("globCorpCd")
    var globCorpCd: String? = null,
    @get:JsonProperty("kraOrgNm")
    @set:JsonProperty("kraOrgNm")
    @JsonProperty("kraOrgNm")
    var kraOrgNm: String? = null,
    @get:JsonProperty("insttClsfCode")
    @set:JsonProperty("insttClsfCode")
    @JsonProperty("insttClsfCode")
    var insttClsfCode: String? = null,
    @get:JsonProperty("fondScCode")
    @set:JsonProperty("fondScCode")
    @JsonProperty("fondScCode")
    var fondScCode: String? = null,
    @get:JsonProperty("srCode")
    @set:JsonProperty("srCode")
    @JsonProperty("srCode")
    var srCode: String? = null,
    @get:JsonProperty("atptOfcdcScCode")
    @set:JsonProperty("atptOfcdcScCode")
    @JsonProperty("atptOfcdcScCode")
    var atptOfcdcScCode: String? = null,
    @get:JsonProperty("orgDVOList")
    @set:JsonProperty("orgDVOList")
    @JsonProperty("orgDVOList")
    var orgDVOList: List<OrgDVO>? = null
)
