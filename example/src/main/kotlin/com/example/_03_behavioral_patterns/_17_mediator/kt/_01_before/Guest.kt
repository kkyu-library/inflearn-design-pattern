package com.example._03_behavioral_patterns._17_mediator.kt._01_before

class Guest(
    private val restaurant: Restaurant = Restaurant(),
    private val cleaningService: CleaningService = CleaningService()
) {
    fun dinner() {
        restaurant.dinner(this)
    }

    fun getTower(numberOfTower: Int) {
        cleaningService.getTower(this, numberOfTower)
    }
}
