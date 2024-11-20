package com.example.voliberia.data.local.booking

import com.example.voliberia.data.Booking
import kotlinx.coroutines.flow.Flow

interface BookingRepository {
    suspend fun readAll(): List<Booking>

    suspend fun create(booking: Booking)

    suspend fun observeAll(): Flow<List<Booking>>
}