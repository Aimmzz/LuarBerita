package com.aimcode.luarberita.data.remote.response

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)