package com.miu.cvbuilder.ui

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory
import com.miu.cvbuilder.ui.fragments.HolderFragment
import com.miu.cvbuilder.ui.fragments.adapters.SectionsPagerAdapter
import javax.inject.Inject

class CvFragmentFactory @Inject constructor(
    private val sectionsPagerAdapter: SectionsPagerAdapter
): FragmentFactory() {

    override fun instantiate(classLoader: ClassLoader, className: String): Fragment {
        return when(className){
            HolderFragment::class.java.name -> HolderFragment(sectionsPagerAdapter)
            else->super.instantiate(classLoader, className)
        }
    }
}