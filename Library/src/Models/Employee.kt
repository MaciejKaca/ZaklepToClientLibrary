package Models

import java.util.*


data class Employee(
    val login: String,
    val firstName: String,
    val lastName: String,
    val email: String,
    val phone: String,
    val createdAt: Date,
    val restaurant: Restaurant
)