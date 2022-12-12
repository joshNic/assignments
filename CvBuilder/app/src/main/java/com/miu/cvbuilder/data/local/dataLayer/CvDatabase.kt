package com.miu.cvbuilder.data.local.dataLayer

import androidx.room.Database
import androidx.room.RoomDatabase
import com.miu.cvbuilder.data.local.dataLayer.daos.*
import com.miu.cvbuilder.data.local.dataLayer.entities.*

@Database(
    entities = [
        CertificationTable::class,
        ContactTable::class,
        EducationTable::class,
        WorkTable::class,
        UserTable::class],
    version = 1
)
abstract class CvDatabase: RoomDatabase() {
    abstract fun userDao():UserDao
    abstract fun contactDao():ContactDao
    abstract fun educationDao():EducationDao
    abstract fun workDao(): WorkDao
    abstract fun certificationDao():CertificationDao
}