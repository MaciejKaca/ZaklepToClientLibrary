package Models

import java.util.*


data class Reservation(
    val id: UUID,
    val restaurant: Restaurant,
    val dateStart: String,
    val dateEnd: String,
    val table: Table,
    val customer: Customer,
    val isConfirmed: Boolean,
    val isActive: Boolean
)