package com.example._01_creational_patterns._02_factory_method.kt._02_after

import com.example._01_creational_patterns._03_abstract_factory.kt._02_after.Anchor
import com.example._01_creational_patterns._03_abstract_factory.kt._02_after.Wheel

abstract class Ship(
    open val name: String,
    open val color: String,
    open val logo: String,
) {
    lateinit var wheel: Wheel
    lateinit var anchor: Anchor
}
