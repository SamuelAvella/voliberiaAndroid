package com.example.voliberia.data

import androidx.room.PrimaryKey

class Seat (
    @PrimaryKey val id: String,          // ID único para el asiento (puede ser generado)
    val number: String,                 // Número del asiento (ej. "A1", "B2")
    val flightId: String,               // Relación con el vuelo (Many-to-One)
    val bookingId: String?,             // Relación con la reserva (nullable si no está reservado)
    val reserved: Boolean = false
)