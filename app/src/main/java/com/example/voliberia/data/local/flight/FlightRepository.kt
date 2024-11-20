package com.example.voliberia.data.local.flight

import com.example.voliberia.data.Flight
import kotlinx.coroutines.flow.Flow

interface FlightRepository {

    suspend fun readAll(): List<Flight>

    suspend fun create(flight: Flight)

    suspend fun observeAll(): Flow<List<Flight>>
}
