package com.example.voliberia.data.local.flight

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.voliberia.data.Flight

@Dao
interface FlightDao {

    @Query("SELECT * FROM flight WHERE id = :flightId")
    suspend fun getFlightById(flightId: String): Flight?

    @Query("SELECT * FROM flight")
    suspend fun getAllFlights(): List<FlightEntity>
}