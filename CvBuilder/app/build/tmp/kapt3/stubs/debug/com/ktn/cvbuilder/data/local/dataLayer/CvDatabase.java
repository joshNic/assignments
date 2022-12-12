package com.ktn.cvbuilder.data.local.dataLayer;

import java.lang.System;

@androidx.room.Database(entities = {com.ktn.cvbuilder.data.local.dataLayer.entities.CertificationTable.class, com.ktn.cvbuilder.data.local.dataLayer.entities.ContactTable.class, com.ktn.cvbuilder.data.local.dataLayer.entities.EducationTable.class, com.ktn.cvbuilder.data.local.dataLayer.entities.WorkTable.class, com.ktn.cvbuilder.data.local.dataLayer.entities.UserTable.class}, version = 1)
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\fH&\u00a8\u0006\r"}, d2 = {"Lcom/ktn/cvbuilder/data/local/dataLayer/CvDatabase;", "Landroidx/room/RoomDatabase;", "()V", "certificationDao", "Lcom/ktn/cvbuilder/data/local/dataLayer/daos/CertificationDao;", "contactDao", "Lcom/ktn/cvbuilder/data/local/dataLayer/daos/ContactDao;", "educationDao", "Lcom/ktn/cvbuilder/data/local/dataLayer/daos/EducationDao;", "userDao", "Lcom/ktn/cvbuilder/data/local/dataLayer/daos/UserDao;", "workDao", "Lcom/ktn/cvbuilder/data/local/dataLayer/daos/WorkDao;", "app_debug"})
public abstract class CvDatabase extends androidx.room.RoomDatabase {
    
    public CvDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.ktn.cvbuilder.data.local.dataLayer.daos.UserDao userDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.ktn.cvbuilder.data.local.dataLayer.daos.ContactDao contactDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.ktn.cvbuilder.data.local.dataLayer.daos.EducationDao educationDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.ktn.cvbuilder.data.local.dataLayer.daos.WorkDao workDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.ktn.cvbuilder.data.local.dataLayer.daos.CertificationDao certificationDao();
}