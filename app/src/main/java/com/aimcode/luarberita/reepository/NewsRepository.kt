package com.aimcode.luarberita.reepository

import com.aimcode.luarberita.data.local.ArticleDatabase
import com.aimcode.luarberita.data.remote.api.RetrofitInstance

class NewsRepository(
    val db: ArticleDatabase
) {
    suspend fun getBreakingNews(countryCode: String, pageNumber: Int) =
        RetrofitInstance.api.getBreakingNews(countryCode, pageNumber)
}