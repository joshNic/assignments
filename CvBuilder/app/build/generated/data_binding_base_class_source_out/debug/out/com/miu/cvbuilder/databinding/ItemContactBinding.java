// Generated by view binder compiler. Do not edit!
package com.miu.cvbuilder.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.imageview.ShapeableImageView;
import com.miu.cvbuilder.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemContactBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView contactType;

  @NonNull
  public final TextView contactValue;

  @NonNull
  public final ShapeableImageView ivMobile;

  private ItemContactBinding(@NonNull LinearLayout rootView, @NonNull TextView contactType,
      @NonNull TextView contactValue, @NonNull ShapeableImageView ivMobile) {
    this.rootView = rootView;
    this.contactType = contactType;
    this.contactValue = contactValue;
    this.ivMobile = ivMobile;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemContactBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemContactBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_contact, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemContactBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.contact_type;
      TextView contactType = ViewBindings.findChildViewById(rootView, id);
      if (contactType == null) {
        break missingId;
      }

      id = R.id.contact_value;
      TextView contactValue = ViewBindings.findChildViewById(rootView, id);
      if (contactValue == null) {
        break missingId;
      }

      id = R.id.iv_mobile;
      ShapeableImageView ivMobile = ViewBindings.findChildViewById(rootView, id);
      if (ivMobile == null) {
        break missingId;
      }

      return new ItemContactBinding((LinearLayout) rootView, contactType, contactValue, ivMobile);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
