package com.example._03_behavioral_patterns._17_mediator.kt._01_before

class Restaurant(
    private val cleaningService: CleaningService = CleaningService()
) {
    fun dinner(guest: Guest) {
        println("dinner $guest")
    }

    fun clean() {
        cleaningService.clean(this)
    }
}
