package com.miu.cvbuilder.data.local.dataLayer.daos

import androidx.lifecycle.LiveData
import androidx.room.*
import com.miu.cvbuilder.data.local.dataLayer.entities.EducationTable

@Dao
interface EducationDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertEducation(education: EducationTable)

    @Delete
    suspend fun deleteEducation(education: EducationTable)

    @Query("SELECT * FROM education_table")
    fun observerAllEducations(): LiveData<List<EducationTable>>

    @Query("SELECT * FROM education_table WHERE userId=:userID")
    fun observeEducationByUserId(userID: String): LiveData<List<EducationTable>>
}