package com.aimcode.luarberita.ui.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.aimcode.luarberita.R
import com.aimcode.luarberita.data.local.ArticleDatabase
import com.aimcode.luarberita.databinding.FragmentArticleBinding
import com.aimcode.luarberita.databinding.FragmentBreakingNewsBinding
import com.aimcode.luarberita.reepository.NewsRepository
import com.aimcode.luarberita.ui.MainActivity
import com.aimcode.luarberita.ui.viewmodel.NewsViewModel
import com.aimcode.luarberita.util.NewsViewModelProviderFactory

class ArticleNewsFragment : Fragment(R.layout.fragment_breaking_news) {

    private var _binding: FragmentArticleBinding? = null
    private val binding get() = _binding!!

    private lateinit var viewModel: NewsViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentArticleBinding.bind(view)

        // Inisialisasi viewModel langsung di sini
        val newsRepository = NewsRepository(ArticleDatabase(requireContext()))
        val viewModelProviderFactory = NewsViewModelProviderFactory(newsRepository)
        viewModel = ViewModelProvider(this, viewModelProviderFactory).get(NewsViewModel::class.java)
    }
}