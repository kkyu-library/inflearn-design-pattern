package com.example._03_behavioral_patterns._23_visitor.kt._01_before

class Rectangle : Shape {

    override fun printTo(device: Device) {
        if (device is Phone) {
            println("print Rectangle to phone")
        } else if (device is Watch) {
            println("print Rectangle to watch")
        }
    }
}
