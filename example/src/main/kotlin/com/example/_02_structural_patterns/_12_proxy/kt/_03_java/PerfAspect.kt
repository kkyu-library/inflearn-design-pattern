package com.example._02_structural_patterns._12_proxy.kt._03_java

import org.aspectj.lang.ProceedingJoinPoint
import org.aspectj.lang.annotation.Around
import org.aspectj.lang.annotation.Aspect
import org.springframework.stereotype.Component

@Aspect
@Component
class PerfAspect {

    @Around("bean(gameService)")
    @Throws(Throwable::class)
    fun timestamp(point: ProceedingJoinPoint) {
        val before = System.currentTimeMillis()
        point.proceed()
        println(System.currentTimeMillis() - before)
    }
}
