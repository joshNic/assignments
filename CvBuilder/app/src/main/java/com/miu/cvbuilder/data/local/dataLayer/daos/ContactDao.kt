package com.miu.cvbuilder.data.local.dataLayer.daos

import androidx.lifecycle.LiveData
import androidx.room.*
import com.miu.cvbuilder.data.local.dataLayer.entities.ContactTable

@Dao
interface ContactDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertContact(contact: ContactTable)

    @Delete
    suspend fun deleteContact(contact: ContactTable)

    @Query("SELECT * FROM contact_table")
    fun observerAllContacts(): LiveData<List<ContactTable>>

    @Query("SELECT * FROM contact_table WHERE userId=:userID")
    fun observeContactByUserId(userID: String): LiveData<List<ContactTable>>
}