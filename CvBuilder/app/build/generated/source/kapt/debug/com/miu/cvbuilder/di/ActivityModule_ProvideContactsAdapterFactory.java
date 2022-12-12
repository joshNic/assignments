// Generated by Dagger (https://dagger.dev).
package com.miu.cvbuilder.di;

import com.miu.cvbuilder.ui.fragments.adapters.ContactsAdapter;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata("dagger.hilt.android.scopes.ActivityScoped")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ActivityModule_ProvideContactsAdapterFactory implements Factory<ContactsAdapter> {
  @Override
  public ContactsAdapter get() {
    return provideContactsAdapter();
  }

  public static ActivityModule_ProvideContactsAdapterFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static ContactsAdapter provideContactsAdapter() {
    return Preconditions.checkNotNullFromProvides(ActivityModule.INSTANCE.provideContactsAdapter());
  }

  private static final class InstanceHolder {
    private static final ActivityModule_ProvideContactsAdapterFactory INSTANCE = new ActivityModule_ProvideContactsAdapterFactory();
  }
}