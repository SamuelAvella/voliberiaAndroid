package com.example.voliberia.data.local.userApp

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface UserAppDao {
    @Insert
    suspend fun insertUser(user: UserAppEntity)

    @Query("SELECT * FROM userApp WHERE id = :userId")
    suspend fun getUserById(userId: String): UserAppEntity?

    @Query("SELECT * FROM userApp")
    suspend fun getAllUsers(): List<UserAppEntity>
}
