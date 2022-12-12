package com.miu.cvbuilder.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.DialogFragment
import androidx.lifecycle.ViewModelProvider
import com.miu.cvbuilder.R
import com.miu.cvbuilder.ui.viewModels.CVBuilderViewModel
import kotlinx.android.synthetic.main.dialog_add_item.*

class AddDialog: DialogFragment(R.layout.dialog_add_item) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val viewModel = ViewModelProvider(requireActivity())[CVBuilderViewModel::class.java]
        val state = viewModel.addItem.value
        dialog_title.text = state?.dialogTitle
        et_title.hint = state?.addHint
        et_content.hint = state?.contentHint
        btn_add.apply {
            setOnClickListener{
                dismiss()
            }
        }
    }
}