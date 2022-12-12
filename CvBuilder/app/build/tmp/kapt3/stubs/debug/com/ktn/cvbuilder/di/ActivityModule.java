package com.ktn.cvbuilder.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ActivityComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J2\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J\u0012\u0010\u0014\u001a\u00020\u00062\b\b\u0001\u0010\u0015\u001a\u00020\u000eH\u0007J\u0010\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0017"}, d2 = {"Lcom/ktn/cvbuilder/di/ActivityModule;", "", "()V", "provideCertificationAdapter", "Lcom/ktn/cvbuilder/ui/fragments/adapters/CertificationAdapter;", "glide", "Lcom/bumptech/glide/RequestManager;", "provideContactsAdapter", "Lcom/ktn/cvbuilder/ui/fragments/adapters/ContactsAdapter;", "provideEducationAdapter", "Lcom/ktn/cvbuilder/ui/fragments/adapters/EducationAdapter;", "provideFragmentAdapter", "Lcom/ktn/cvbuilder/ui/fragments/adapters/SectionsPagerAdapter;", "activityContext", "Landroid/content/Context;", "contactsAdapter", "certificationAdapter", "educationAdapter", "workAdapter", "Lcom/ktn/cvbuilder/ui/fragments/adapters/WorkAdapter;", "provideGlide", "context", "provideWorkAdapter", "app_debug"})
@dagger.Module()
public final class ActivityModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.ktn.cvbuilder.di.ActivityModule INSTANCE = null;
    
    private ActivityModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.scopes.ActivityScoped()
    @dagger.Provides()
    public final com.bumptech.glide.RequestManager provideGlide(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ActivityContext()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.scopes.ActivityScoped()
    @dagger.Provides()
    public final com.ktn.cvbuilder.ui.fragments.adapters.ContactsAdapter provideContactsAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.scopes.ActivityScoped()
    @dagger.Provides()
    public final com.ktn.cvbuilder.ui.fragments.adapters.CertificationAdapter provideCertificationAdapter(@org.jetbrains.annotations.NotNull()
    com.bumptech.glide.RequestManager glide) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.scopes.ActivityScoped()
    @dagger.Provides()
    public final com.ktn.cvbuilder.ui.fragments.adapters.WorkAdapter provideWorkAdapter(@org.jetbrains.annotations.NotNull()
    com.bumptech.glide.RequestManager glide) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.scopes.ActivityScoped()
    @dagger.Provides()
    public final com.ktn.cvbuilder.ui.fragments.adapters.EducationAdapter provideEducationAdapter(@org.jetbrains.annotations.NotNull()
    com.bumptech.glide.RequestManager glide) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.scopes.ActivityScoped()
    @dagger.Provides()
    public final com.ktn.cvbuilder.ui.fragments.adapters.SectionsPagerAdapter provideFragmentAdapter(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ActivityContext()
    android.content.Context activityContext, @org.jetbrains.annotations.NotNull()
    com.ktn.cvbuilder.ui.fragments.adapters.ContactsAdapter contactsAdapter, @org.jetbrains.annotations.NotNull()
    com.ktn.cvbuilder.ui.fragments.adapters.CertificationAdapter certificationAdapter, @org.jetbrains.annotations.NotNull()
    com.ktn.cvbuilder.ui.fragments.adapters.EducationAdapter educationAdapter, @org.jetbrains.annotations.NotNull()
    com.ktn.cvbuilder.ui.fragments.adapters.WorkAdapter workAdapter) {
        return null;
    }
}