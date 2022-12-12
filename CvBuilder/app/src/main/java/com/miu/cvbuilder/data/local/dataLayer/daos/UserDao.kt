package com.miu.cvbuilder.data.local.dataLayer.daos

import androidx.lifecycle.LiveData
import androidx.room.*
import com.miu.cvbuilder.data.local.dataLayer.entities.UserTable

@Dao
interface UserDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertUser(user: UserTable)

    @Delete
    suspend fun deleteUser(user: UserTable)

    @Query("SELECT * FROM user")
    fun observerAllUser(): LiveData<List<UserTable>>
}