package com.example._03_behavioral_patterns._23_visitor.kt._02_after

class Circle : Shape {

    override fun accept(device: Device) {
        device.print(this)
    }
}
