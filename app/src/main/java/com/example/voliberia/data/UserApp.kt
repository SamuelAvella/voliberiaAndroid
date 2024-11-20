package com.example.voliberia.data

import androidx.room.PrimaryKey

class UserApp (
    @PrimaryKey val id: String,
    val name: String,
    val surname: String,
    val email: String,
    val password: String,
    val idDocument: String,
    val phoneNumber: String,
    val birthDate: String
)