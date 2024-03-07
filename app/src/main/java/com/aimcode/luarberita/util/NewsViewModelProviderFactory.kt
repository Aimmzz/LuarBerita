package com.aimcode.luarberita.util

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.aimcode.luarberita.reepository.NewsRepository
import com.aimcode.luarberita.ui.viewmodel.NewsViewModel

class NewsViewModelProviderFactory(
    val newsRepository: NewsRepository
) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return NewsViewModel(newsRepository) as T
    }
}