package Models

import java.util.*


data class Table(
    val id: UUID,
    val numberOfSeats: Int,
    val coordinates: Coordinates
)