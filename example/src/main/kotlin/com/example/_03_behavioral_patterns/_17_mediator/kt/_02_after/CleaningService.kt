package com.example._03_behavioral_patterns._17_mediator.kt._02_after

class CleaningService(
    private val frontDesk: FrontDesk = FrontDesk()
) {
    fun getTowers(guestId: Int, numberOfTowers: Int) {
        val roomNumber = frontDesk.getRoomNumberFor(guestId)
        println("provide $numberOfTowers to $roomNumber")
    }
}
