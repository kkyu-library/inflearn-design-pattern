package com.example._03_behavioral_patterns._17_mediator.kt._02_after

import java.time.LocalDateTime

class Guest(
    val id: Int,
    private val frontDesk: FrontDesk = FrontDesk()
) {
    fun getTowers(numberOfTowers: Int) {
        frontDesk.getTowers(this, numberOfTowers)
    }

    private fun dinner(dateTime: LocalDateTime) {
        frontDesk.dinner(this, dateTime)
    }
}
