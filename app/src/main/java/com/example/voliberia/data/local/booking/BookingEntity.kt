package com.example.voliberia.data.local.booking
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.ForeignKey
import com.example.voliberia.data.local.flight.FlightEntity
import com.example.voliberia.data.local.userApp.UserAppEntity

@Entity(
    tableName = "booking",
    foreignKeys = [
        ForeignKey(entity = FlightEntity::class, parentColumns = ["id"], childColumns = ["flightId"]),
        ForeignKey(entity = UserAppEntity::class, parentColumns = ["id"], childColumns = ["userId"])
    ]
)
data class BookingEntity(
    @PrimaryKey val id: String,
    val flightId: String,
    val userId: String,
    val bookingState: Boolean,
    val seats: String, // JSON como String
    val totalPrice: Double
)
