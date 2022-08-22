package com.example._01_creational_patterns._04_builder.kt._01_before

import org.junit.jupiter.api.Test
import java.time.LocalDate

internal class TourPlanTest {

    @Test
    fun create() {
        val tourPlan = TourPlan(
            title = "칸쿤 여행",
            nights = 2,
            days = 3,
            startDate = LocalDate.of(2020, 12, 9),
            whereToStay = "리조트",
        )

        tourPlan.addPlan(0, "체크인 이후 짐풀기")
        tourPlan.addPlan(0, "저녁 식사")
        tourPlan.addPlan(1, "조식 부페에서 식사")
        tourPlan.addPlan(1, "해변가 산책")
        tourPlan.addPlan(1, "점심은 수영장 근처 음식점에서 먹기")
        tourPlan.addPlan(1, "리조트 수영장에서 놀기")
        tourPlan.addPlan(1, "저녁은 BBQ 식당에서 스테이크")
        tourPlan.addPlan(2, "조식 부페에서 식사")
        tourPlan.addPlan(2, "체크아웃")

        println(tourPlan)
    }
}
