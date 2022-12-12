package com.ktn.cvbuilder.data.local.dataLayer.daos;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u001c\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\'J\u0014\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n0\tH\'\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lcom/ktn/cvbuilder/data/local/dataLayer/daos/CertificationDao;", "", "deleteCertificate", "", "certificate", "Lcom/ktn/cvbuilder/data/local/dataLayer/entities/CertificationTable;", "(Lcom/ktn/cvbuilder/data/local/dataLayer/entities/CertificationTable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertCertificate", "observeCertificationByUserId", "Landroidx/lifecycle/LiveData;", "", "userID", "", "observerAllCertificates", "app_debug"})
public abstract interface CertificationDao {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insertCertificate(@org.jetbrains.annotations.NotNull()
    com.ktn.cvbuilder.data.local.dataLayer.entities.CertificationTable certificate, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Delete()
    public abstract java.lang.Object deleteCertificate(@org.jetbrains.annotations.NotNull()
    com.ktn.cvbuilder.data.local.dataLayer.entities.CertificationTable certificate, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM certification_table")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.ktn.cvbuilder.data.local.dataLayer.entities.CertificationTable>> observerAllCertificates();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM certification_table WHERE userId=:userID")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.ktn.cvbuilder.data.local.dataLayer.entities.CertificationTable>> observeCertificationByUserId(@org.jetbrains.annotations.NotNull()
    java.lang.String userID);
}