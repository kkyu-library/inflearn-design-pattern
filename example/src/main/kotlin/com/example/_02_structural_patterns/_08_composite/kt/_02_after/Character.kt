package com.example._02_structural_patterns._08_composite.kt._02_after

class Character(
    private val bag: Bag,
    override val price: Int = bag.price
) : Component
