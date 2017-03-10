package com.melorriaga.kokemon.data

data class APIResourceList(
        val count: Int,
        val next: String,
        val previous: Boolean,
        val results: List<NamedAPIResource>
)
