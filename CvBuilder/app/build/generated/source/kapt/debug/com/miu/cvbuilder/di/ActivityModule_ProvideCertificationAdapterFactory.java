// Generated by Dagger (https://dagger.dev).
package com.miu.cvbuilder.di;

import com.bumptech.glide.RequestManager;
import com.miu.cvbuilder.ui.fragments.adapters.CertificationAdapter;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata("dagger.hilt.android.scopes.ActivityScoped")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ActivityModule_ProvideCertificationAdapterFactory implements Factory<CertificationAdapter> {
  private final Provider<RequestManager> glideProvider;

  public ActivityModule_ProvideCertificationAdapterFactory(Provider<RequestManager> glideProvider) {
    this.glideProvider = glideProvider;
  }

  @Override
  public CertificationAdapter get() {
    return provideCertificationAdapter(glideProvider.get());
  }

  public static ActivityModule_ProvideCertificationAdapterFactory create(
      Provider<RequestManager> glideProvider) {
    return new ActivityModule_ProvideCertificationAdapterFactory(glideProvider);
  }

  public static CertificationAdapter provideCertificationAdapter(RequestManager glide) {
    return Preconditions.checkNotNullFromProvides(ActivityModule.INSTANCE.provideCertificationAdapter(glide));
  }
}
