package com.example._03_behavioral_patterns._17_mediator.kt._01_before

class Gym(
    private val cleaningService: CleaningService
) {
    fun clean() {
        cleaningService.clean(this)
    }
}
