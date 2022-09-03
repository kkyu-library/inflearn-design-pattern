package com.example._03_behavioral_patterns._14_command.kt._01_before

class Light(
    private var isOn: Boolean = false
) {

    fun on() {
        println("불을 켭니다.")
        isOn = true
    }

    fun off() {
        println("불을 끕니다.")
        isOn = false
    }
}
