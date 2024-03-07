package com.aimcode.luarberita.ui.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.aimcode.luarberita.R
import com.aimcode.luarberita.ui.MainActivity
import com.aimcode.luarberita.ui.viewmodel.NewsViewModel

class SavedNewsFragment : Fragment(R.layout.fragment_saved_news) {

    lateinit var viewModel: NewsViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = (activity as MainActivity).viewModel
    }
}