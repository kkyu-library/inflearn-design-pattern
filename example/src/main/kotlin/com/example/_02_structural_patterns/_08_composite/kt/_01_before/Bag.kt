package com.example._02_structural_patterns._08_composite.kt._01_before

class Bag(
    val items: MutableList<Item> = ArrayList()
) {
    fun add(item: Item) {
        items.add(item)
    }
}
