package com.example.voliberia.data

import androidx.room.PrimaryKey

class Flight (
    @PrimaryKey val id: String = "",
    val origin: String = "",
    val destination: String,
    val departureDate: String,
    val arrivalDate: String,
    val seatPrice: Double,
    val seats: String // JSON como String
)