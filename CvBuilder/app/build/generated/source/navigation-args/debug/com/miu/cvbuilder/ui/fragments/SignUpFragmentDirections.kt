package com.miu.cvbuilder.ui.fragments

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.miu.cvbuilder.R

public class SignUpFragmentDirections private constructor() {
  public companion object {
    public fun actionSignUpFragmentToLoginFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_signUpFragment_to_loginFragment)
  }
}
