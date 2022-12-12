// Generated by Dagger (https://dagger.dev).
package com.miu.cvbuilder.di;

import com.miu.cvbuilder.data.local.dataLayer.CvDatabase;
import com.miu.cvbuilder.data.local.dataLayer.daos.CertificationDao;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideCertificationDaoFactory implements Factory<CertificationDao> {
  private final Provider<CvDatabase> databaseProvider;

  public AppModule_ProvideCertificationDaoFactory(Provider<CvDatabase> databaseProvider) {
    this.databaseProvider = databaseProvider;
  }

  @Override
  public CertificationDao get() {
    return provideCertificationDao(databaseProvider.get());
  }

  public static AppModule_ProvideCertificationDaoFactory create(
      Provider<CvDatabase> databaseProvider) {
    return new AppModule_ProvideCertificationDaoFactory(databaseProvider);
  }

  public static CertificationDao provideCertificationDao(CvDatabase database) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideCertificationDao(database));
  }
}
