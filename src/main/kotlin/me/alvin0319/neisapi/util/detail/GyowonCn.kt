package me.alvin0319.neisapi.util.detail

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
data class GyowonCn(
    val sqlAction: Any? = null,
    val sumTot: Any? = null,
    val sumMan: Any? = null,
    val sumWoman: Any? = null,
    val grade: Any? = null,
    val cnt: Any? = null,
    val tcnt: String? = null,
    val stdntDob: Any? = null,
    val aplrScCode: Any? = null,
    val chldSno: Any? = null,
    val schpaRltnNm: Any? = null,
    val emhsScCode: Any? = null,
    val schulCrseScCode: Any? = null,
    val schulCode: Any? = null,
    val kraOrgNm: Any? = null,
    val dddepNm: Any? = null,
    val classNm: Any? = null,
    val stdntCnEncpt: Any? = null,
    val stdntNameEncpt: Any? = null,
    val stdntPNo: Any? = null,
    val confmReqstDtm: Any? = null,
    val confmTrtScCode: Any? = null,
    val confmTrtDtm: Any? = null,
    val confmOpetrName: Any? = null,
    val confmTrtNote: Any? = null,
    val mdfcDtm: Any? = null,
    val updid: Any? = null,
    val sidoGyoyookCd: Any? = null,
    val schulKndScCode: Any? = null,
    val aplrSno: Any? = null
)
