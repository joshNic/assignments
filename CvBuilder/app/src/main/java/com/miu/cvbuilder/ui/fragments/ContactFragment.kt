package com.miu.cvbuilder.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.miu.cvbuilder.R
import com.miu.cvbuilder.ui.viewModels.CVBuilderViewModel
import com.miu.cvbuilder.ui.fragments.adapters.ContactsAdapter
import kotlinx.android.synthetic.main.fragment_contact.*

class ContactFragment constructor(
    private val contactsAdapter: ContactsAdapter
    ) :Fragment(R.layout.fragment_contact) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val cVBuilderViewModel = ViewModelProvider(requireActivity())[CVBuilderViewModel::class.java]
        cVBuilderViewModel.cv.observe(requireActivity()){
            contactsAdapter.contacts = it.contacts
        }
        rv_contactList.apply {
            adapter = contactsAdapter
            layoutManager = LinearLayoutManager(requireContext())

        }
    }
}