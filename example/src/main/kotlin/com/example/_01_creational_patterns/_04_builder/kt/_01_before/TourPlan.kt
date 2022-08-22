package com.example._01_creational_patterns._04_builder.kt._01_before

import java.time.LocalDate

data class TourPlan(
    val title: String,
    var nights: Int = 0,
    var days: Int = 0,
    val startDate: LocalDate,
    val whereToStay: String = "",
    val plans: MutableList<DetailPlan> = mutableListOf()
) {
    fun addPlan(day: Int, plan: String) {
        plans.add(DetailPlan(day, plan))
    }
}
