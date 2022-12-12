// Generated by view binder compiler. Do not edit!
package com.ktn.cvbuilder.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.ktn.cvbuilder.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentLoginBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView createAccount;

  @NonNull
  public final TextView forgotPassword;

  @NonNull
  public final MaterialButton loginBtn;

  @NonNull
  public final TextInputEditText password;

  @NonNull
  public final TextInputEditText username;

  @NonNull
  public final TextInputLayout usernameTI;

  private FragmentLoginBinding(@NonNull LinearLayout rootView, @NonNull TextView createAccount,
      @NonNull TextView forgotPassword, @NonNull MaterialButton loginBtn,
      @NonNull TextInputEditText password, @NonNull TextInputEditText username,
      @NonNull TextInputLayout usernameTI) {
    this.rootView = rootView;
    this.createAccount = createAccount;
    this.forgotPassword = forgotPassword;
    this.loginBtn = loginBtn;
    this.password = password;
    this.username = username;
    this.usernameTI = usernameTI;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_login, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentLoginBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.createAccount;
      TextView createAccount = ViewBindings.findChildViewById(rootView, id);
      if (createAccount == null) {
        break missingId;
      }

      id = R.id.forgot_password;
      TextView forgotPassword = ViewBindings.findChildViewById(rootView, id);
      if (forgotPassword == null) {
        break missingId;
      }

      id = R.id.loginBtn;
      MaterialButton loginBtn = ViewBindings.findChildViewById(rootView, id);
      if (loginBtn == null) {
        break missingId;
      }

      id = R.id.password;
      TextInputEditText password = ViewBindings.findChildViewById(rootView, id);
      if (password == null) {
        break missingId;
      }

      id = R.id.username;
      TextInputEditText username = ViewBindings.findChildViewById(rootView, id);
      if (username == null) {
        break missingId;
      }

      id = R.id.usernameTI;
      TextInputLayout usernameTI = ViewBindings.findChildViewById(rootView, id);
      if (usernameTI == null) {
        break missingId;
      }

      return new FragmentLoginBinding((LinearLayout) rootView, createAccount, forgotPassword,
          loginBtn, password, username, usernameTI);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}