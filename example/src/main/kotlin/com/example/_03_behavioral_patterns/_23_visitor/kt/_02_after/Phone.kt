package com.example._03_behavioral_patterns._23_visitor.kt._02_after

class Phone : Device {

    override fun print(circle: Circle) {
        println("Print Circle to Phone")
    }

    override fun print(rectangle: Rectangle) {
        println("Print Rectangle to Phone")
    }

    override fun print(triangle: Triangle) {
        println("Print Triangle to Phone")
    }
}
