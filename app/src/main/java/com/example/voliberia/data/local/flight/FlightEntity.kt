package com.example.voliberia.data.local.flight

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "flight")
data class FlightEntity(
    @PrimaryKey val id: String,
    val origin: String,
    val destination: String,
    val departureDate: String,
    val arrivalDate: String,
    val seatPrice: Double,
    val seats: String // JSON como String
)
