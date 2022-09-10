package com.example._03_behavioral_patterns._17_mediator.kt._02_after

import java.time.LocalDateTime

class FrontDesk(
    private val cleaningService: CleaningService = CleaningService(),
    private val restaurant: Restaurant = Restaurant()
) {
    fun getTowers(guest: Guest, numberOfTowers: Int) {
        cleaningService.getTowers(guest.id, numberOfTowers)
    }

    fun getRoomNumberFor(guestId: Int): String {
        return "1111"
    }

    fun dinner(guest: Guest, dateTime: LocalDateTime) {
        restaurant.dinner(guest.id, dateTime)
    }
}
