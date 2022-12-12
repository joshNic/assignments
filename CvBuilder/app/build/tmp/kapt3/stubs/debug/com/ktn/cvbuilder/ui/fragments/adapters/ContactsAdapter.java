package com.ktn.cvbuilder.ui.fragments.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0011H\u0016J\u0018\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0011H\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R4\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b2\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/ktn/cvbuilder/ui/fragments/adapters/ContactsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/ktn/cvbuilder/ui/fragments/adapters/ContactsAdapter$ContactViewHolder;", "()V", "callback", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/ktn/cvbuilder/data/Contact;", "value", "", "contacts", "getContacts", "()Ljava/util/List;", "setContacts", "(Ljava/util/List;)V", "differ", "Landroidx/recyclerview/widget/AsyncListDiffer;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ContactViewHolder", "app_debug"})
public final class ContactsAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.ktn.cvbuilder.ui.fragments.adapters.ContactsAdapter.ContactViewHolder> {
    private final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.ktn.cvbuilder.data.Contact> callback = null;
    private final androidx.recyclerview.widget.AsyncListDiffer<com.ktn.cvbuilder.data.Contact> differ = null;
    
    public ContactsAdapter() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.ktn.cvbuilder.data.Contact> getContacts() {
        return null;
    }
    
    public final void setContacts(@org.jetbrains.annotations.Nullable()
    java.util.List<com.ktn.cvbuilder.data.Contact> value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.ktn.cvbuilder.ui.fragments.adapters.ContactsAdapter.ContactViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.ktn.cvbuilder.ui.fragments.adapters.ContactsAdapter.ContactViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/ktn/cvbuilder/ui/fragments/adapters/ContactsAdapter$ContactViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "app_debug"})
    public static final class ContactViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public ContactViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
}