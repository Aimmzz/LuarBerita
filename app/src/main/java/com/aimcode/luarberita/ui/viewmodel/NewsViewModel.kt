package com.aimcode.luarberita.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.aimcode.luarberita.reepository.NewsRepository

class NewsViewModel(
    val repository: NewsRepository
): ViewModel() {
}