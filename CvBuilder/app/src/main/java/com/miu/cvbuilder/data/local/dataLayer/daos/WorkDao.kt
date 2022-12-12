package com.miu.cvbuilder.data.local.dataLayer.daos

import androidx.lifecycle.LiveData
import androidx.room.*
import com.miu.cvbuilder.data.local.dataLayer.entities.WorkTable

@Dao
interface WorkDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertWork(work: WorkTable)

    @Delete
    suspend fun deleteWork(work: WorkTable)

    @Query("SELECT * FROM work_table")
    fun observerAllWorks(): LiveData<List<WorkTable>>

    @Query("SELECT * FROM work_table WHERE userId=:userID")
    fun observeWorkByUserId(userID: String): LiveData<List<WorkTable>>
}