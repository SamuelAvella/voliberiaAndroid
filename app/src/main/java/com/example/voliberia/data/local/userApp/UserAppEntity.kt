package com.example.voliberia.data.local.userApp
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "userApp")
data class UserAppEntity(
    @PrimaryKey val id: String,
    val name: String,
    val surname: String,
    val email: String,
    val password: String,
    val idDocument: String,
    val phoneNumber: String,
    val birthDate: String
)
