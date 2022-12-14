// Generated by Dagger (https://dagger.dev).
package com.miu.cvbuilder.ui.viewModels;

import com.miu.cvbuilder.data.local.LocalDataAccessApi;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CVBuilderViewModel_Factory implements Factory<CVBuilderViewModel> {
  private final Provider<LocalDataAccessApi> localDataAccessApiProvider;

  public CVBuilderViewModel_Factory(Provider<LocalDataAccessApi> localDataAccessApiProvider) {
    this.localDataAccessApiProvider = localDataAccessApiProvider;
  }

  @Override
  public CVBuilderViewModel get() {
    return newInstance(localDataAccessApiProvider.get());
  }

  public static CVBuilderViewModel_Factory create(
      Provider<LocalDataAccessApi> localDataAccessApiProvider) {
    return new CVBuilderViewModel_Factory(localDataAccessApiProvider);
  }

  public static CVBuilderViewModel newInstance(LocalDataAccessApi localDataAccessApi) {
    return new CVBuilderViewModel(localDataAccessApi);
  }
}
