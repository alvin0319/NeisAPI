package me.alvin0319.neisapi.util.detail

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
data class HsCnt(
    val sqlAction: Any? = null,
    val sumTot: String? = null,
    val sumMan: String? = null,
    val sumWoman: String? = null,
    val schulCode: Any? = null,
    val ay: Any? = null,
    val dghtCrseScCode: Any? = null,
    val dghtCrseScCodeNm: Any? = null,
    val schulCrseScCode: Any? = null,
    val schulCrseScCodeNm: Any? = null,
    val grade: Any? = null,
    val cnt: Any? = null
)
