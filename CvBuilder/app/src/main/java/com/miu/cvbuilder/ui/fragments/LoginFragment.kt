package com.miu.cvbuilder.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.facebook.CallbackManager
import com.facebook.login.LoginResult
import com.miu.cvbuilder.R
import com.miu.cvbuilder.ui.viewModels.CVBuilderViewModel
import kotlinx.android.synthetic.main.fragment_login.*

class LoginFragment : Fragment(R.layout.fragment_login) {

    lateinit var loginResult:LoginResult
    lateinit var callbackManager: CallbackManager
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val viewModel = ViewModelProvider(requireActivity())[CVBuilderViewModel::class.java]
        username.setText(viewModel.cv.value?.name)
        password.setText(viewModel.cv.value?.password)
        loginBtn.apply {
            setOnClickListener{
                val _username = username.text.toString()
                val _password = password.text.toString()
                if(_password.isEmpty()){
                    password.error = "Password Cannot be empty"
                }else if(_username.isEmpty()){
                    username.error = "Username cannot be empty"
                }else{
                    findNavController().navigate(
                        LoginFragmentDirections.actionLoginFragmentToHolderFragment()
                    )
                }
            }
        }
        createAccount.apply {
            setOnClickListener{
                findNavController().navigate(
                    LoginFragmentDirections.actionLoginFragmentToSignUpFragment()
                )
            }
        }
    }

}