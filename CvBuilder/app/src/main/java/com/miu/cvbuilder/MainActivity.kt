package com.miu.cvbuilder

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.miu.cvbuilder.data.local.DataSource
import com.miu.cvbuilder.ui.CvFragmentFactory
import com.miu.cvbuilder.ui.viewModels.CVBuilderViewModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var fragmentFactory: CvFragmentFactory

    lateinit var viewModel: CVBuilderViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this)[CVBuilderViewModel::class.java]
        viewModel.setCV(DataSource.CV)
        supportFragmentManager.fragmentFactory = fragmentFactory
        setContentView(R.layout.activity_main)
    }
}