package me.alvin0319.neisapi.util.detail

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
data class ComData(
    val method: String? = null,
    val globCorpCd: String? = null,
    val resultMsg: String? = null,
    val dept: String? = null,
    val userId: String? = null,
    val ip: String? = null,
    val resultCode: String? = null,
    val commitYn: String? = null,
    val lang: String? = null,
    val useSession: String? = null,
    val voId: String? = null,
    val svcId: String? = null,
    val testExeSeq: String? = null
)
