package com.miu.cvbuilder.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.miu.cvbuilder.R
import com.miu.cvbuilder.ui.viewModels.CVBuilderViewModel
import com.miu.cvbuilder.ui.fragments.adapters.WorkAdapter
import kotlinx.android.synthetic.main.fragment_work.*

class WorkFragment constructor(
    private val workAdapter: WorkAdapter
):Fragment(R.layout.fragment_work) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val cVBuilderViewModel = ViewModelProvider(requireActivity())[CVBuilderViewModel::class.java]
        cVBuilderViewModel.cv.observe(requireActivity()){
            workAdapter.works = it.works
        }
        rv_experienceList.apply {
            adapter = workAdapter
            layoutManager = LinearLayoutManager(requireContext())
        }
    }
}