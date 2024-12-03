package com.example.voliberia.data.local.seat

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "seat")
data class SeatEntity(
    @PrimaryKey val id: String,          // ID único para el asiento (puede ser generado)
    val number: String,                 // Número del asiento (ej. "A1", "B2")
    val flightId: String,               // Relación con el vuelo (Many-to-One)
    val bookingId: String?,             // Relación con la reserva (nullable si no está reservado)
    val reserved: Boolean = false
)
