package com.example._03_behavioral_patterns._23_visitor.kt._02_after

class Pad : Device {

    override fun print(circle: Circle) {
        println("Print Circle to Pad")
    }

    override fun print(rectangle: Rectangle) {
        println("Print Rectangle to Pad")
    }

    override fun print(triangle: Triangle) {
        println("Print Triangle to Pad")
    }
}
