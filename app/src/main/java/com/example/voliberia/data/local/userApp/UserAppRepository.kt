package com.example.voliberia.data.local.userApp

import com.example.voliberia.data.UserApp
import kotlinx.coroutines.flow.Flow

interface UserAppRepository {

    suspend fun readAll(): List<UserApp>

    suspend fun create(user: UserApp)

    suspend fun observeAll(): Flow<List<UserApp>>
}