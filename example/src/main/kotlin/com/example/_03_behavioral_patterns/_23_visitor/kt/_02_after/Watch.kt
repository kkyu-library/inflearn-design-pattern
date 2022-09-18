package com.example._03_behavioral_patterns._23_visitor.kt._02_after

class Watch : Device {

    override fun print(circle: Circle) {
        println("Print Circle to Watch")
    }

    override fun print(rectangle: Rectangle) {
        println("Print Rectangle to Watch")
    }

    override fun print(triangle: Triangle) {
        println("Print Triangle to Watch")
    }
}
