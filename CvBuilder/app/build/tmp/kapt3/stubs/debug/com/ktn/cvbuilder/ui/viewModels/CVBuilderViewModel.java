package com.ktn.cvbuilder.ui.viewModels;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013J\u001e\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0013J\u000e\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\tR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/ktn/cvbuilder/ui/viewModels/CVBuilderViewModel;", "Landroidx/lifecycle/ViewModel;", "localDataAccessApi", "Lcom/ktn/cvbuilder/data/local/LocalDataAccessApi;", "(Lcom/ktn/cvbuilder/data/local/LocalDataAccessApi;)V", "_addItem", "Landroidx/lifecycle/MutableLiveData;", "Lcom/ktn/cvbuilder/domain/states/AddItemState;", "_cv", "Lcom/ktn/cvbuilder/data/CV;", "addItem", "Landroidx/lifecycle/LiveData;", "getAddItem", "()Landroidx/lifecycle/LiveData;", "cv", "getCv", "createUser", "", "userName", "", "password", "setAddItem", "dialogTitle", "titleHint", "contentHint", "setCV", "value", "app_debug"})
public final class CVBuilderViewModel extends androidx.lifecycle.ViewModel {
    private final com.ktn.cvbuilder.data.local.LocalDataAccessApi localDataAccessApi = null;
    private final androidx.lifecycle.MutableLiveData<com.ktn.cvbuilder.data.CV> _cv = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.ktn.cvbuilder.data.CV> cv = null;
    private final androidx.lifecycle.MutableLiveData<com.ktn.cvbuilder.domain.states.AddItemState> _addItem = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.ktn.cvbuilder.domain.states.AddItemState> addItem = null;
    
    @javax.inject.Inject()
    public CVBuilderViewModel(@org.jetbrains.annotations.NotNull()
    com.ktn.cvbuilder.data.local.LocalDataAccessApi localDataAccessApi) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.ktn.cvbuilder.data.CV> getCv() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.ktn.cvbuilder.domain.states.AddItemState> getAddItem() {
        return null;
    }
    
    public final void setCV(@org.jetbrains.annotations.NotNull()
    com.ktn.cvbuilder.data.CV value) {
    }
    
    public final void createUser(@org.jetbrains.annotations.NotNull()
    java.lang.String userName, @org.jetbrains.annotations.NotNull()
    java.lang.String password) {
    }
    
    public final void setAddItem(@org.jetbrains.annotations.NotNull()
    java.lang.String dialogTitle, @org.jetbrains.annotations.NotNull()
    java.lang.String titleHint, @org.jetbrains.annotations.NotNull()
    java.lang.String contentHint) {
    }
}