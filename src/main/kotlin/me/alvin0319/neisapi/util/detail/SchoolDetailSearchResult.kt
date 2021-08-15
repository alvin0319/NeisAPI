package me.alvin0319.neisapi.util.detail

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
data class SchoolDetailSearchResult(
    val result: Result? = null,
    val action_title: String? = null,
    val resultSVO: ResultSVO? = null
)
