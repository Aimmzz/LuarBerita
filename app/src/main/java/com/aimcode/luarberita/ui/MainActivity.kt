package com.aimcode.luarberita.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.aimcode.luarberita.R
import com.aimcode.luarberita.data.local.ArticleDatabase
import com.aimcode.luarberita.databinding.ActivityMainBinding
import com.aimcode.luarberita.reepository.NewsRepository
import com.aimcode.luarberita.ui.viewmodel.NewsViewModel
import com.aimcode.luarberita.util.NewsViewModelProviderFactory

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navController = findNavController(R.id.newsNavHostFragment)
        binding.bottomNavigationView.setupWithNavController(navController)
    }
}