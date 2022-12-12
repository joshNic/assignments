package com.miu.cvbuilder.data.local.dataLayer.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "certification_table")
data class CertificationTable(

    var certificationImage:Int,
    var certificationName:String,
    var yearAttended:String,
    var userId:Int,

    @PrimaryKey(autoGenerate = true)
    val id: Int? = null
)
