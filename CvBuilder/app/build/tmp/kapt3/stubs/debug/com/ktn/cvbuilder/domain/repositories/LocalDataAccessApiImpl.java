package com.ktn.cvbuilder.domain.repositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u0019\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0014H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J\u0019\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0018H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019J\u0019\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001cH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001dJ\u0019\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020 H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010!J\u0019\u0010\"\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0019\u0010#\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0014H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J\u0019\u0010$\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0018H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019J\u0019\u0010%\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001cH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001dJ\u0019\u0010&\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020 H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010!J\u001c\u0010\'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100)0(2\u0006\u0010*\u001a\u00020+H\u0016J\u001c\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140)0(2\u0006\u0010*\u001a\u00020+H\u0016J\u001c\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180)0(2\u0006\u0010*\u001a\u00020+H\u0016J\u001c\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0)0(2\u0006\u0010*\u001a\u00020+H\u0016J\u0014\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100)0(H\u0016J\u0014\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140)0(H\u0016J\u0014\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180)0(H\u0016J\u0014\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0)0(H\u0016J\u0014\u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0)0(H\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u00064"}, d2 = {"Lcom/ktn/cvbuilder/domain/repositories/LocalDataAccessApiImpl;", "Lcom/ktn/cvbuilder/data/local/LocalDataAccessApi;", "userDao", "Lcom/ktn/cvbuilder/data/local/dataLayer/daos/UserDao;", "workDao", "Lcom/ktn/cvbuilder/data/local/dataLayer/daos/WorkDao;", "educationDao", "Lcom/ktn/cvbuilder/data/local/dataLayer/daos/EducationDao;", "contactDao", "Lcom/ktn/cvbuilder/data/local/dataLayer/daos/ContactDao;", "certificationDao", "Lcom/ktn/cvbuilder/data/local/dataLayer/daos/CertificationDao;", "(Lcom/ktn/cvbuilder/data/local/dataLayer/daos/UserDao;Lcom/ktn/cvbuilder/data/local/dataLayer/daos/WorkDao;Lcom/ktn/cvbuilder/data/local/dataLayer/daos/EducationDao;Lcom/ktn/cvbuilder/data/local/dataLayer/daos/ContactDao;Lcom/ktn/cvbuilder/data/local/dataLayer/daos/CertificationDao;)V", "deleteCertificate", "", "certificate", "Lcom/ktn/cvbuilder/data/local/dataLayer/entities/CertificationTable;", "(Lcom/ktn/cvbuilder/data/local/dataLayer/entities/CertificationTable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteContact", "contact", "Lcom/ktn/cvbuilder/data/local/dataLayer/entities/ContactTable;", "(Lcom/ktn/cvbuilder/data/local/dataLayer/entities/ContactTable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteEducation", "education", "Lcom/ktn/cvbuilder/data/local/dataLayer/entities/EducationTable;", "(Lcom/ktn/cvbuilder/data/local/dataLayer/entities/EducationTable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteUser", "user", "Lcom/ktn/cvbuilder/data/local/dataLayer/entities/UserTable;", "(Lcom/ktn/cvbuilder/data/local/dataLayer/entities/UserTable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteWork", "work", "Lcom/ktn/cvbuilder/data/local/dataLayer/entities/WorkTable;", "(Lcom/ktn/cvbuilder/data/local/dataLayer/entities/WorkTable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertCertificate", "insertContact", "insertEducation", "insertUser", "insertWork", "observeCertificationByUserId", "Landroidx/lifecycle/LiveData;", "", "userID", "", "observeContactByUserId", "observeEducationByUserId", "observeWorkByUserId", "observerAllCertificates", "observerAllContacts", "observerAllEducations", "observerAllUser", "observerAllWorks", "app_debug"})
public final class LocalDataAccessApiImpl implements com.ktn.cvbuilder.data.local.LocalDataAccessApi {
    private final com.ktn.cvbuilder.data.local.dataLayer.daos.UserDao userDao = null;
    private final com.ktn.cvbuilder.data.local.dataLayer.daos.WorkDao workDao = null;
    private final com.ktn.cvbuilder.data.local.dataLayer.daos.EducationDao educationDao = null;
    private final com.ktn.cvbuilder.data.local.dataLayer.daos.ContactDao contactDao = null;
    private final com.ktn.cvbuilder.data.local.dataLayer.daos.CertificationDao certificationDao = null;
    
    @javax.inject.Inject()
    public LocalDataAccessApiImpl(@org.jetbrains.annotations.NotNull()
    com.ktn.cvbuilder.data.local.dataLayer.daos.UserDao userDao, @org.jetbrains.annotations.NotNull()
    com.ktn.cvbuilder.data.local.dataLayer.daos.WorkDao workDao, @org.jetbrains.annotations.NotNull()
    com.ktn.cvbuilder.data.local.dataLayer.daos.EducationDao educationDao, @org.jetbrains.annotations.NotNull()
    com.ktn.cvbuilder.data.local.dataLayer.daos.ContactDao contactDao, @org.jetbrains.annotations.NotNull()
    com.ktn.cvbuilder.data.local.dataLayer.daos.CertificationDao certificationDao) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object insertUser(@org.jetbrains.annotations.NotNull()
    com.ktn.cvbuilder.data.local.dataLayer.entities.UserTable user, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object deleteUser(@org.jetbrains.annotations.NotNull()
    com.ktn.cvbuilder.data.local.dataLayer.entities.UserTable user, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.util.List<com.ktn.cvbuilder.data.local.dataLayer.entities.UserTable>> observerAllUser() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object insertWork(@org.jetbrains.annotations.NotNull()
    com.ktn.cvbuilder.data.local.dataLayer.entities.WorkTable work, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object deleteWork(@org.jetbrains.annotations.NotNull()
    com.ktn.cvbuilder.data.local.dataLayer.entities.WorkTable work, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.util.List<com.ktn.cvbuilder.data.local.dataLayer.entities.WorkTable>> observerAllWorks() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.util.List<com.ktn.cvbuilder.data.local.dataLayer.entities.WorkTable>> observeWorkByUserId(@org.jetbrains.annotations.NotNull()
    java.lang.String userID) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object insertEducation(@org.jetbrains.annotations.NotNull()
    com.ktn.cvbuilder.data.local.dataLayer.entities.EducationTable education, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object deleteEducation(@org.jetbrains.annotations.NotNull()
    com.ktn.cvbuilder.data.local.dataLayer.entities.EducationTable education, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.util.List<com.ktn.cvbuilder.data.local.dataLayer.entities.EducationTable>> observerAllEducations() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.util.List<com.ktn.cvbuilder.data.local.dataLayer.entities.EducationTable>> observeEducationByUserId(@org.jetbrains.annotations.NotNull()
    java.lang.String userID) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object insertContact(@org.jetbrains.annotations.NotNull()
    com.ktn.cvbuilder.data.local.dataLayer.entities.ContactTable contact, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object deleteContact(@org.jetbrains.annotations.NotNull()
    com.ktn.cvbuilder.data.local.dataLayer.entities.ContactTable contact, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.util.List<com.ktn.cvbuilder.data.local.dataLayer.entities.ContactTable>> observerAllContacts() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.util.List<com.ktn.cvbuilder.data.local.dataLayer.entities.ContactTable>> observeContactByUserId(@org.jetbrains.annotations.NotNull()
    java.lang.String userID) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object insertCertificate(@org.jetbrains.annotations.NotNull()
    com.ktn.cvbuilder.data.local.dataLayer.entities.CertificationTable certificate, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object deleteCertificate(@org.jetbrains.annotations.NotNull()
    com.ktn.cvbuilder.data.local.dataLayer.entities.CertificationTable certificate, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.util.List<com.ktn.cvbuilder.data.local.dataLayer.entities.CertificationTable>> observerAllCertificates() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.util.List<com.ktn.cvbuilder.data.local.dataLayer.entities.CertificationTable>> observeCertificationByUserId(@org.jetbrains.annotations.NotNull()
    java.lang.String userID) {
        return null;
    }
}