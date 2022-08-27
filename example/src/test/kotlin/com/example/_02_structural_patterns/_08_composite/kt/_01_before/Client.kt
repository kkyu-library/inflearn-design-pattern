package com.example._02_structural_patterns._08_composite.kt._01_before

import org.junit.jupiter.api.Test

internal class Client {

    @Test
    fun client() {
        val doranBlade = Item("도란검", 450)
        val healPotion = Item("체력 물약", 50)

        val bag = Bag()
        bag.add(doranBlade)
        bag.add(healPotion)

        printPrice(doranBlade)
        printPrice(bag)
    }

    private fun printPrice(item: Item) {
        println(item.price)
    }

    private fun printPrice(bag: Bag) {
        val sum = bag.items.stream().mapToInt { obj: Item -> obj.price }.sum()
        println(sum)
    }
}
