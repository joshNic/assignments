package com.ktn.cvbuilder.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\n\u001a\u00020\u0007\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\f\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\f\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\f\u00a2\u0006\u0002\u0010\u0014J\t\u0010#\u001a\u00020\u0003H\u00c6\u0003J\u0011\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\fH\u00c6\u0003J\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\t\u0010&\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0007H\u00c6\u0003J\t\u0010(\u001a\u00020\tH\u00c6\u0003J\t\u0010)\u001a\u00020\u0007H\u00c6\u0003J\u0011\u0010*\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u00c6\u0003J\u0011\u0010+\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\fH\u00c6\u0003J\u0011\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\fH\u00c6\u0003J\u008d\u0001\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0003\u0010\n\u001a\u00020\u00072\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\f2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\f2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\fH\u00c6\u0001J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00101\u001a\u00020\u0007H\u00d6\u0001J\t\u00102\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\n\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0019\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001fR\u0019\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0019\u00a8\u00063"}, d2 = {"Lcom/ktn/cvbuilder/data/CV;", "", "name", "", "password", "title", "careerNote", "", "experience", "Lcom/ktn/cvbuilder/data/Experience;", "aboutMe", "educations", "", "Lcom/ktn/cvbuilder/data/Education;", "certifications", "Lcom/ktn/cvbuilder/data/Certification;", "works", "Lcom/ktn/cvbuilder/data/Work;", "contacts", "Lcom/ktn/cvbuilder/data/Contact;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/ktn/cvbuilder/data/Experience;ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getAboutMe", "()I", "getCareerNote", "getCertifications", "()Ljava/util/List;", "getContacts", "getEducations", "getExperience", "()Lcom/ktn/cvbuilder/data/Experience;", "getName", "()Ljava/lang/String;", "getPassword", "getTitle", "getWorks", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class CV {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String password = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String title = null;
    private final int careerNote = 0;
    @org.jetbrains.annotations.NotNull()
    private final com.ktn.cvbuilder.data.Experience experience = null;
    private final int aboutMe = 0;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<com.ktn.cvbuilder.data.Education> educations = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<com.ktn.cvbuilder.data.Certification> certifications = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<com.ktn.cvbuilder.data.Work> works = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<com.ktn.cvbuilder.data.Contact> contacts = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.ktn.cvbuilder.data.CV copy(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @androidx.annotation.StringRes()
    int careerNote, @org.jetbrains.annotations.NotNull()
    com.ktn.cvbuilder.data.Experience experience, @androidx.annotation.StringRes()
    int aboutMe, @org.jetbrains.annotations.Nullable()
    java.util.List<com.ktn.cvbuilder.data.Education> educations, @org.jetbrains.annotations.Nullable()
    java.util.List<com.ktn.cvbuilder.data.Certification> certifications, @org.jetbrains.annotations.Nullable()
    java.util.List<com.ktn.cvbuilder.data.Work> works, @org.jetbrains.annotations.Nullable()
    java.util.List<com.ktn.cvbuilder.data.Contact> contacts) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public CV(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @androidx.annotation.StringRes()
    int careerNote, @org.jetbrains.annotations.NotNull()
    com.ktn.cvbuilder.data.Experience experience, @androidx.annotation.StringRes()
    int aboutMe, @org.jetbrains.annotations.Nullable()
    java.util.List<com.ktn.cvbuilder.data.Education> educations, @org.jetbrains.annotations.Nullable()
    java.util.List<com.ktn.cvbuilder.data.Certification> certifications, @org.jetbrains.annotations.Nullable()
    java.util.List<com.ktn.cvbuilder.data.Work> works, @org.jetbrains.annotations.Nullable()
    java.util.List<com.ktn.cvbuilder.data.Contact> contacts) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPassword() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int getCareerNote() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ktn.cvbuilder.data.Experience component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ktn.cvbuilder.data.Experience getExperience() {
        return null;
    }
    
    public final int component6() {
        return 0;
    }
    
    public final int getAboutMe() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.ktn.cvbuilder.data.Education> component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.ktn.cvbuilder.data.Education> getEducations() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.ktn.cvbuilder.data.Certification> component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.ktn.cvbuilder.data.Certification> getCertifications() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.ktn.cvbuilder.data.Work> component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.ktn.cvbuilder.data.Work> getWorks() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.ktn.cvbuilder.data.Contact> component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.ktn.cvbuilder.data.Contact> getContacts() {
        return null;
    }
}