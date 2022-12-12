package com.miu.cvbuilder.ui.fragments.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0013H\u0016J\u0018\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0013H\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R4\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\n2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\n8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/miu/cvbuilder/ui/fragments/adapters/EducationAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/miu/cvbuilder/ui/fragments/adapters/EducationAdapter$EducationViewHolder;", "glide", "Lcom/bumptech/glide/RequestManager;", "(Lcom/bumptech/glide/RequestManager;)V", "differ", "Landroidx/recyclerview/widget/AsyncListDiffer;", "Lcom/miu/cvbuilder/data/Education;", "value", "", "educations", "getEducations", "()Ljava/util/List;", "setEducations", "(Ljava/util/List;)V", "itemCallback", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "EducationViewHolder", "app_debug"})
public final class EducationAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.miu.cvbuilder.ui.fragments.adapters.EducationAdapter.EducationViewHolder> {
    private final com.bumptech.glide.RequestManager glide = null;
    private final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.miu.cvbuilder.data.Education> itemCallback = null;
    private final androidx.recyclerview.widget.AsyncListDiffer<com.miu.cvbuilder.data.Education> differ = null;
    
    @javax.inject.Inject
    public EducationAdapter(@org.jetbrains.annotations.NotNull
    com.bumptech.glide.RequestManager glide) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.miu.cvbuilder.data.Education> getEducations() {
        return null;
    }
    
    public final void setEducations(@org.jetbrains.annotations.Nullable
    java.util.List<com.miu.cvbuilder.data.Education> value) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.miu.cvbuilder.ui.fragments.adapters.EducationAdapter.EducationViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.miu.cvbuilder.ui.fragments.adapters.EducationAdapter.EducationViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/miu/cvbuilder/ui/fragments/adapters/EducationAdapter$EducationViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "app_debug"})
    public static final class EducationViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public EducationViewHolder(@org.jetbrains.annotations.NotNull
        android.view.View itemView) {
            super(null);
        }
    }
}