package com.miu.cvbuilder.ui.fragments.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0015H\u0016J\u0018\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0015H\u0016R4\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/miu/cvbuilder/ui/fragments/adapters/CertificationAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/miu/cvbuilder/ui/fragments/adapters/CertificationAdapter$CertificationViewHolder;", "glide", "Lcom/bumptech/glide/RequestManager;", "(Lcom/bumptech/glide/RequestManager;)V", "value", "", "Lcom/miu/cvbuilder/data/Certification;", "certifications", "getCertifications", "()Ljava/util/List;", "setCertifications", "(Ljava/util/List;)V", "differ", "Landroidx/recyclerview/widget/AsyncListDiffer;", "getGlide", "()Lcom/bumptech/glide/RequestManager;", "itemCallback", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "CertificationViewHolder", "app_debug"})
public final class CertificationAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.miu.cvbuilder.ui.fragments.adapters.CertificationAdapter.CertificationViewHolder> {
    @org.jetbrains.annotations.NotNull
    private final com.bumptech.glide.RequestManager glide = null;
    private final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.miu.cvbuilder.data.Certification> itemCallback = null;
    private final androidx.recyclerview.widget.AsyncListDiffer<com.miu.cvbuilder.data.Certification> differ = null;
    
    @javax.inject.Inject
    public CertificationAdapter(@org.jetbrains.annotations.NotNull
    com.bumptech.glide.RequestManager glide) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.bumptech.glide.RequestManager getGlide() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.miu.cvbuilder.data.Certification> getCertifications() {
        return null;
    }
    
    public final void setCertifications(@org.jetbrains.annotations.Nullable
    java.util.List<com.miu.cvbuilder.data.Certification> value) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.miu.cvbuilder.ui.fragments.adapters.CertificationAdapter.CertificationViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.miu.cvbuilder.ui.fragments.adapters.CertificationAdapter.CertificationViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/miu/cvbuilder/ui/fragments/adapters/CertificationAdapter$CertificationViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "app_debug"})
    public static final class CertificationViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public CertificationViewHolder(@org.jetbrains.annotations.NotNull
        android.view.View itemView) {
            super(null);
        }
    }
}