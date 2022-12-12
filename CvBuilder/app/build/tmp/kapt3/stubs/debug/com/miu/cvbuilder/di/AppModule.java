package com.miu.cvbuilder.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\t\u001a\u00020\u00062\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J0\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0004H\u0007J\u0010\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0019"}, d2 = {"Lcom/miu/cvbuilder/di/AppModule;", "", "()V", "provideCertificationDao", "Lcom/miu/cvbuilder/data/local/dataLayer/daos/CertificationDao;", "database", "Lcom/miu/cvbuilder/data/local/dataLayer/CvDatabase;", "provideContactDao", "Lcom/miu/cvbuilder/data/local/dataLayer/daos/ContactDao;", "provideCvDatabaseItemDatabase", "context", "Landroid/content/Context;", "provideEducationDao", "Lcom/miu/cvbuilder/data/local/dataLayer/daos/EducationDao;", "provideLocalDataAccessRepository", "Lcom/miu/cvbuilder/data/local/LocalDataAccessApi;", "userDao", "Lcom/miu/cvbuilder/data/local/dataLayer/daos/UserDao;", "contactDao", "educationDao", "workDao", "Lcom/miu/cvbuilder/data/local/dataLayer/daos/WorkDao;", "certificationDao", "provideUserDao", "provideWorkDao", "app_debug"})
@dagger.Module
public final class AppModule {
    @org.jetbrains.annotations.NotNull
    public static final com.miu.cvbuilder.di.AppModule INSTANCE = null;
    
    private AppModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @javax.inject.Singleton
    public final com.miu.cvbuilder.data.local.dataLayer.CvDatabase provideCvDatabaseItemDatabase(@org.jetbrains.annotations.NotNull
    @dagger.hilt.android.qualifiers.ApplicationContext
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @javax.inject.Singleton
    public final com.miu.cvbuilder.data.local.dataLayer.daos.UserDao provideUserDao(@org.jetbrains.annotations.NotNull
    com.miu.cvbuilder.data.local.dataLayer.CvDatabase database) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @javax.inject.Singleton
    public final com.miu.cvbuilder.data.local.dataLayer.daos.ContactDao provideContactDao(@org.jetbrains.annotations.NotNull
    com.miu.cvbuilder.data.local.dataLayer.CvDatabase database) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @javax.inject.Singleton
    public final com.miu.cvbuilder.data.local.dataLayer.daos.EducationDao provideEducationDao(@org.jetbrains.annotations.NotNull
    com.miu.cvbuilder.data.local.dataLayer.CvDatabase database) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @javax.inject.Singleton
    public final com.miu.cvbuilder.data.local.dataLayer.daos.WorkDao provideWorkDao(@org.jetbrains.annotations.NotNull
    com.miu.cvbuilder.data.local.dataLayer.CvDatabase database) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @javax.inject.Singleton
    public final com.miu.cvbuilder.data.local.dataLayer.daos.CertificationDao provideCertificationDao(@org.jetbrains.annotations.NotNull
    com.miu.cvbuilder.data.local.dataLayer.CvDatabase database) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @javax.inject.Singleton
    public final com.miu.cvbuilder.data.local.LocalDataAccessApi provideLocalDataAccessRepository(@org.jetbrains.annotations.NotNull
    com.miu.cvbuilder.data.local.dataLayer.daos.UserDao userDao, @org.jetbrains.annotations.NotNull
    com.miu.cvbuilder.data.local.dataLayer.daos.ContactDao contactDao, @org.jetbrains.annotations.NotNull
    com.miu.cvbuilder.data.local.dataLayer.daos.EducationDao educationDao, @org.jetbrains.annotations.NotNull
    com.miu.cvbuilder.data.local.dataLayer.daos.WorkDao workDao, @org.jetbrains.annotations.NotNull
    com.miu.cvbuilder.data.local.dataLayer.daos.CertificationDao certificationDao) {
        return null;
    }
}