package com.example._02_structural_patterns._08_composite.kt._02_after

import org.junit.jupiter.api.Test

internal class Client {

    @Test
    fun main() {
        val doranBlade = Item("도란검", 450)
        val healPotion = Item("체력 물약", 50)

        val bag = Bag()
        bag.add(doranBlade)
        bag.add(healPotion)

        printPrice(doranBlade)
        printPrice(bag)
    }

    private fun printPrice(component: Component) {
        println(component.price)
    }
}
