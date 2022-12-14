// Generated by view binder compiler. Do not edit!
package com.miu.cvbuilder.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.miu.cvbuilder.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentAboutMeBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final RecyclerView rvCertificationList;

  @NonNull
  public final RecyclerView rvEducationList;

  @NonNull
  public final TextView tvAboutMe;

  @NonNull
  public final TextView tvCareerNote;

  @NonNull
  public final TextView tvCertification;

  @NonNull
  public final TextView tvEducation;

  private FragmentAboutMeBinding(@NonNull ConstraintLayout rootView,
      @NonNull RecyclerView rvCertificationList, @NonNull RecyclerView rvEducationList,
      @NonNull TextView tvAboutMe, @NonNull TextView tvCareerNote,
      @NonNull TextView tvCertification, @NonNull TextView tvEducation) {
    this.rootView = rootView;
    this.rvCertificationList = rvCertificationList;
    this.rvEducationList = rvEducationList;
    this.tvAboutMe = tvAboutMe;
    this.tvCareerNote = tvCareerNote;
    this.tvCertification = tvCertification;
    this.tvEducation = tvEducation;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentAboutMeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentAboutMeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_about_me, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentAboutMeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.rv_certification_list;
      RecyclerView rvCertificationList = ViewBindings.findChildViewById(rootView, id);
      if (rvCertificationList == null) {
        break missingId;
      }

      id = R.id.rv_education_list;
      RecyclerView rvEducationList = ViewBindings.findChildViewById(rootView, id);
      if (rvEducationList == null) {
        break missingId;
      }

      id = R.id.tv_about_me;
      TextView tvAboutMe = ViewBindings.findChildViewById(rootView, id);
      if (tvAboutMe == null) {
        break missingId;
      }

      id = R.id.tvCareerNote;
      TextView tvCareerNote = ViewBindings.findChildViewById(rootView, id);
      if (tvCareerNote == null) {
        break missingId;
      }

      id = R.id.tv_certification;
      TextView tvCertification = ViewBindings.findChildViewById(rootView, id);
      if (tvCertification == null) {
        break missingId;
      }

      id = R.id.tv_education;
      TextView tvEducation = ViewBindings.findChildViewById(rootView, id);
      if (tvEducation == null) {
        break missingId;
      }

      return new FragmentAboutMeBinding((ConstraintLayout) rootView, rvCertificationList,
          rvEducationList, tvAboutMe, tvCareerNote, tvCertification, tvEducation);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
