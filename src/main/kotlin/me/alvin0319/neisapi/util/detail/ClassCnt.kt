package me.alvin0319.neisapi.util.detail

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
data class ClassCnt(
    val sqlAction: Any? = null,
    val sumTot: Any? = null,
    val sumMan: Any? = null,
    val sumWoman: Any? = null,
    val schulCode: String? = null,
    val ay: String? = null,
    val dghtCrseScCode: String? = null,
    val dghtCrseScCodeNm: String? = null,
    val schulCrseScCode: Any? = null,
    val schulCrseScCodeNm: Any? = null,
    val grade: String? = null,
    val cnt: String? = null
)
