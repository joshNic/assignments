package com.miu.cvbuilder.data.local.dataLayer.entities;

import java.lang.System;

@androidx.room.Entity(tableName = "certification_table")
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0013JB\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010#\u001a\u00020\u0003H\u00d6\u0001J\t\u0010$\u001a\u00020\u0005H\u00d6\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000b\"\u0004\b\u0016\u0010\rR\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000f\"\u0004\b\u0018\u0010\u0011\u00a8\u0006%"}, d2 = {"Lcom/miu/cvbuilder/data/local/dataLayer/entities/CertificationTable;", "", "certificationImage", "", "certificationName", "", "yearAttended", "userId", "id", "(ILjava/lang/String;Ljava/lang/String;ILjava/lang/Integer;)V", "getCertificationImage", "()I", "setCertificationImage", "(I)V", "getCertificationName", "()Ljava/lang/String;", "setCertificationName", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getUserId", "setUserId", "getYearAttended", "setYearAttended", "component1", "component2", "component3", "component4", "component5", "copy", "(ILjava/lang/String;Ljava/lang/String;ILjava/lang/Integer;)Lcom/miu/cvbuilder/data/local/dataLayer/entities/CertificationTable;", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class CertificationTable {
    private int certificationImage;
    @org.jetbrains.annotations.NotNull
    private java.lang.String certificationName;
    @org.jetbrains.annotations.NotNull
    private java.lang.String yearAttended;
    private int userId;
    @org.jetbrains.annotations.Nullable
    @androidx.room.PrimaryKey(autoGenerate = true)
    private final java.lang.Integer id = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.miu.cvbuilder.data.local.dataLayer.entities.CertificationTable copy(int certificationImage, @org.jetbrains.annotations.NotNull
    java.lang.String certificationName, @org.jetbrains.annotations.NotNull
    java.lang.String yearAttended, int userId, @org.jetbrains.annotations.Nullable
    java.lang.Integer id) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public CertificationTable(int certificationImage, @org.jetbrains.annotations.NotNull
    java.lang.String certificationName, @org.jetbrains.annotations.NotNull
    java.lang.String yearAttended, int userId, @org.jetbrains.annotations.Nullable
    java.lang.Integer id) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getCertificationImage() {
        return 0;
    }
    
    public final void setCertificationImage(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCertificationName() {
        return null;
    }
    
    public final void setCertificationName(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getYearAttended() {
        return null;
    }
    
    public final void setYearAttended(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int getUserId() {
        return 0;
    }
    
    public final void setUserId(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getId() {
        return null;
    }
}