package com.example._03_behavioral_patterns._23_visitor.kt._02_after

fun main() {
    val rectangle: Shape = Rectangle()
    val device: Device = Pad()
    rectangle.accept(device)
}
