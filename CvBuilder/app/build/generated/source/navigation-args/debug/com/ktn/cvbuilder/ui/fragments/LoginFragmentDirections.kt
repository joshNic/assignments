package com.ktn.cvbuilder.ui.fragments

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.ktn.cvbuilder.R

public class LoginFragmentDirections private constructor() {
  public companion object {
    public fun actionLoginFragmentToHolderFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_loginFragment_to_holderFragment)

    public fun actionLoginFragmentToSignUpFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_loginFragment_to_signUpFragment)
  }
}
