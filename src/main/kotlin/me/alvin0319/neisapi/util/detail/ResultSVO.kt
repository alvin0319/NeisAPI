package me.alvin0319.neisapi.util.detail

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
data class ResultSVO(
    val flag: String? = null,
    val svcId: String? = null,
    val voId: String? = null,
    val method: String? = null,
    val userId: String? = null,
    val ip: String? = null,
    val resultCode: String? = null,
    val resultMsg: String? = null,
    val comData: ComData? = null,
    val dept: String? = null,
    val lang: String? = null,
    val useSession: String? = null,
    val commitYn: String? = null,
    val testExeSeq: String? = null,
    val globCorpCd: String? = null,
    val swcSciSi00M00List: List<SwcSciSi00M00>? = null,
    val itrt01yr: String? = null,
    val itrt02yr: String? = null,
    val itrt03yr: String? = null,
    val insttNm: String? = null,
    val schulCode: String? = null,
    val schulKndScCode: String? = null,
    val schulCrseScCode: String? = null,
    val classCntList: List<ClassCnt>? = null,
    val gyowonCnList: List<GyowonCn>? = null,
    val hsCntList: List<HsCnt>? = null,
    val chldSno: String? = null,
    val aplrScCode: String? = null
)
