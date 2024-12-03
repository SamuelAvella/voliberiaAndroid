package com.example.voliberia.data

import androidx.room.PrimaryKey

class Booking (
    @PrimaryKey val id: String,
    val flightId: String,
    val userId: String,
    val bookingState: Boolean,
    val totalPrice: Double
)