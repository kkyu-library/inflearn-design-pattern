package com.example._03_behavioral_patterns._23_visitor.kt._01_before

class Triangle : Shape {

    override fun printTo(device: Device) {
        if (device is Phone) {
            println("print Triangle to Phone")
        } else if (device is Watch) {
            println("print Triangle to Watch")
        }
    }
}
