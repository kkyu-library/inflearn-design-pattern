package com.example._03_behavioral_patterns._17_mediator.kt._01_before

fun main() {
    val guest = Guest()
    guest.getTower(3)
    guest.dinner()

    val restaurant = Restaurant()
    restaurant.clean()
}
