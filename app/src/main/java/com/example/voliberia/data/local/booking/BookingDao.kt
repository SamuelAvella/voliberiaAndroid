package com.example.voliberia.data.local.booking
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface BookingDao {

    @Insert
    suspend fun insertBooking(booking: BookingEntity)

    @Query("SELECT * FROM booking WHERE id = :bookingId")
    suspend fun getBookingById(bookingId: String): BookingEntity?

    @Query("SELECT * FROM booking")
    suspend fun getAllBookings(): List<BookingEntity>
}
