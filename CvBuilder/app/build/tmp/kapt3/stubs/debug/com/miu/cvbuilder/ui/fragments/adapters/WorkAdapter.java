package com.miu.cvbuilder.ui.fragments.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0014H\u0016J\u0018\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0014H\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0010\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\b0\b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R4\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\r2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\r8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001e"}, d2 = {"Lcom/miu/cvbuilder/ui/fragments/adapters/WorkAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/miu/cvbuilder/ui/fragments/adapters/WorkAdapter$WorkHolder;", "glide", "Lcom/bumptech/glide/RequestManager;", "(Lcom/bumptech/glide/RequestManager;)V", "callback", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/miu/cvbuilder/data/Work;", "differ", "Landroidx/recyclerview/widget/AsyncListDiffer;", "kotlin.jvm.PlatformType", "value", "", "works", "getWorks", "()Ljava/util/List;", "setWorks", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "WorkHolder", "app_debug"})
public final class WorkAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.miu.cvbuilder.ui.fragments.adapters.WorkAdapter.WorkHolder> {
    private final com.bumptech.glide.RequestManager glide = null;
    private final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.miu.cvbuilder.data.Work> callback = null;
    private final androidx.recyclerview.widget.AsyncListDiffer<com.miu.cvbuilder.data.Work> differ = null;
    
    @javax.inject.Inject
    public WorkAdapter(@org.jetbrains.annotations.NotNull
    com.bumptech.glide.RequestManager glide) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.miu.cvbuilder.data.Work> getWorks() {
        return null;
    }
    
    public final void setWorks(@org.jetbrains.annotations.Nullable
    java.util.List<com.miu.cvbuilder.data.Work> value) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.miu.cvbuilder.ui.fragments.adapters.WorkAdapter.WorkHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.miu.cvbuilder.ui.fragments.adapters.WorkAdapter.WorkHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/miu/cvbuilder/ui/fragments/adapters/WorkAdapter$WorkHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "app_debug"})
    public static final class WorkHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public WorkHolder(@org.jetbrains.annotations.NotNull
        android.view.View itemView) {
            super(null);
        }
    }
}