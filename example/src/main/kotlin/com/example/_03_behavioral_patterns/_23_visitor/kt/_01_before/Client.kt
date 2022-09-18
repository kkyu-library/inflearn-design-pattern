package com.example._03_behavioral_patterns._23_visitor.kt._01_before

fun main() {
    val rectangle: Shape = Rectangle()
    val device: Device = Phone()
    rectangle.printTo(device)
}
