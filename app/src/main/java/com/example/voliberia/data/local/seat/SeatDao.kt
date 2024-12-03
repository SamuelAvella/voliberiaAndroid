package com.example.voliberia.data.local.seat

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.voliberia.data.local.userApp.UserAppEntity

@Dao
interface SeatDao {
    @Insert
    suspend fun insertSeat(user: UserAppEntity)

    @Query("SELECT * FROM userApp WHERE id = :userId")
    suspend fun getUserById(userId: String): UserAppEntity?

    @Query("SELECT * FROM userApp")
    suspend fun getAllUsers(): List<UserAppEntity>
}