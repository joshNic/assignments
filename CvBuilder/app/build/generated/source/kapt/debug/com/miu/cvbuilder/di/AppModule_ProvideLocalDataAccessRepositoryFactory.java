// Generated by Dagger (https://dagger.dev).
package com.miu.cvbuilder.di;

import com.miu.cvbuilder.data.local.LocalDataAccessApi;
import com.miu.cvbuilder.data.local.dataLayer.daos.CertificationDao;
import com.miu.cvbuilder.data.local.dataLayer.daos.ContactDao;
import com.miu.cvbuilder.data.local.dataLayer.daos.EducationDao;
import com.miu.cvbuilder.data.local.dataLayer.daos.UserDao;
import com.miu.cvbuilder.data.local.dataLayer.daos.WorkDao;
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
public final class AppModule_ProvideLocalDataAccessRepositoryFactory implements Factory<LocalDataAccessApi> {
  private final Provider<UserDao> userDaoProvider;

  private final Provider<ContactDao> contactDaoProvider;

  private final Provider<EducationDao> educationDaoProvider;

  private final Provider<WorkDao> workDaoProvider;

  private final Provider<CertificationDao> certificationDaoProvider;

  public AppModule_ProvideLocalDataAccessRepositoryFactory(Provider<UserDao> userDaoProvider,
      Provider<ContactDao> contactDaoProvider, Provider<EducationDao> educationDaoProvider,
      Provider<WorkDao> workDaoProvider, Provider<CertificationDao> certificationDaoProvider) {
    this.userDaoProvider = userDaoProvider;
    this.contactDaoProvider = contactDaoProvider;
    this.educationDaoProvider = educationDaoProvider;
    this.workDaoProvider = workDaoProvider;
    this.certificationDaoProvider = certificationDaoProvider;
  }

  @Override
  public LocalDataAccessApi get() {
    return provideLocalDataAccessRepository(userDaoProvider.get(), contactDaoProvider.get(), educationDaoProvider.get(), workDaoProvider.get(), certificationDaoProvider.get());
  }

  public static AppModule_ProvideLocalDataAccessRepositoryFactory create(
      Provider<UserDao> userDaoProvider, Provider<ContactDao> contactDaoProvider,
      Provider<EducationDao> educationDaoProvider, Provider<WorkDao> workDaoProvider,
      Provider<CertificationDao> certificationDaoProvider) {
    return new AppModule_ProvideLocalDataAccessRepositoryFactory(userDaoProvider, contactDaoProvider, educationDaoProvider, workDaoProvider, certificationDaoProvider);
  }

  public static LocalDataAccessApi provideLocalDataAccessRepository(UserDao userDao,
      ContactDao contactDao, EducationDao educationDao, WorkDao workDao,
      CertificationDao certificationDao) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideLocalDataAccessRepository(userDao, contactDao, educationDao, workDao, certificationDao));
  }
}
