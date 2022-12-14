package com.miu.cvbuilder.data.local.dataLayer.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user")
data class UserTable(
    var userName: String,
    var password: String,

    @PrimaryKey(autoGenerate = true)
    val id: Int? = null
)
