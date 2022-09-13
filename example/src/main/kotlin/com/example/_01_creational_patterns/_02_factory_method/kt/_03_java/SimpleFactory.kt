package com.example._01_creational_patterns._02_factory_method.kt._03_java

import com.example._01_creational_patterns._02_factory_method.java._02_after.BlackShip
import com.example._01_creational_patterns._02_factory_method.java._02_after.WhiteShip

class SimpleFactory {

    fun createProduct(name: String): Any {
        if (name == "whiteship") {
            return WhiteShip()
        } else if (name == "blackship") {
            return BlackShip()
        }
        throw IllegalArgumentException()
    }
}
