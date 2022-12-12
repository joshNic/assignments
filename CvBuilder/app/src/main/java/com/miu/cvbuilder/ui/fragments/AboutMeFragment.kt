package com.miu.cvbuilder.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.miu.cvbuilder.R
import com.miu.cvbuilder.ui.viewModels.CVBuilderViewModel
import com.miu.cvbuilder.ui.fragments.adapters.CertificationAdapter
import com.miu.cvbuilder.ui.fragments.adapters.EducationAdapter
import kotlinx.android.synthetic.main.fragment_about_me.*

class AboutMeFragment constructor(
    private val educationAdapter: EducationAdapter,
    private val certificationAdapter: CertificationAdapter
) :Fragment(R.layout.fragment_about_me) {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val cVBuilderViewModel = ViewModelProvider(requireActivity())[CVBuilderViewModel::class.java]
        cVBuilderViewModel.cv.observe(requireActivity()){ cv->
            run{
                certificationAdapter.certifications = cv.certifications
                educationAdapter.educations = cv.educations
            }
        }
        rv_certification_list.apply {
            adapter = certificationAdapter
            layoutManager = LinearLayoutManager(requireContext())
        }
        rv_education_list.apply {
            adapter = educationAdapter
            layoutManager = LinearLayoutManager(requireContext())
        }
    }
}