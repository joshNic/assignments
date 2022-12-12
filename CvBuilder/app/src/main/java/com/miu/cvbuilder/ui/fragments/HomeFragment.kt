package com.miu.cvbuilder.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.miu.cvbuilder.R
import com.miu.cvbuilder.ui.viewModels.CVBuilderViewModel
import javax.inject.Inject

class HomeFragment:Fragment(R.layout.fragment_home) {

    @Inject
    lateinit var cVBuilderViewModel: CVBuilderViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}