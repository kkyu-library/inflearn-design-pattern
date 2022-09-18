package com.example._03_behavioral_patterns._23_visitor.kt._02_after

interface Device {
    fun print(circle: Circle)
    fun print(rectangle: Rectangle)
    fun print(triangle: Triangle)
}
