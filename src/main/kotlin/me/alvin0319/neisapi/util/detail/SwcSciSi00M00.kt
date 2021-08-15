package me.alvin0319.neisapi.util.detail

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
data class SwcSciSi00M00(
    val sqlAction: Any? = null,
    val orgCode: String? = null,
    val kraOrgNm: String? = null,
    val engOrgNm: String? = null,
    val gan: String? = null,
    val fondYmd: String? = null,
    val foasMemrd: String? = null,
    val zipCode: String? = null,
    val zipAdres: String? = null,
    val zipCode2: String? = null,
    val zipAdres2: String? = null,
    val zipDtlad: String? = null,
    val orgTelno: String? = null,
    val orgFaxno: String? = null,
    val homepage: String? = null,
    val dghtScCode: String? = null,
    val dghtCrseScNm: String? = null,
    val coeduScNm: String? = null,
    val fondScNm: String? = null,
    val schulCrseScNm: String? = null,
    val schulKndScNm: String? = null,
    val hsGnrlBusnsScNm: String? = null,
    val grade: Any? = null,
    val scaYr: Any? = null,
    val scaSem: Any? = null,
    val itrtYr: Any? = null,
    val itrtSem: Any? = null,
    val itrtYrApplcYn: Any? = null,
    val scaYrApplcYn: Any? = null,
    val schulCode: Any? = null,
    val ay: Any? = null,
    val dghtCrseScCode: Any? = null,
    val dddepCode: Any? = null,
    val ordScCode: Any? = null,
    val classCode: Any? = null,
    val gradeCode: Any? = null,
    val classNm: Any? = null,
    val stdilSeq: Any? = null,
    val regYmd: Any? = null,
    val dddepNm: Any? = null,
    val cnt1: Any? = null,
    val cnt2: Any? = null,
    val cnt3: Any? = null,
    val age: Any? = null,
    val sem: Any? = null
)
