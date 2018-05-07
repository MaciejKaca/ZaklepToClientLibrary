package Models

import java.util.*


data class Restaurant(
    val id: UUID,
    val name: String,
    val description: String,
    val cuisine: String,
    val localization: String,
    val representativePhotoUrl: String,
    val tables: List<Table>
)