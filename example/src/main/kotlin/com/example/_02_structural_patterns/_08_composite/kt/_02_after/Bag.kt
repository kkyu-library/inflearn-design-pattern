package com.example._02_structural_patterns._08_composite.kt._02_after

class Bag(
    private val components: MutableList<Component> = ArrayList()
) : Component {

    fun add(component: Component) {
        components.add(component)
    }

    fun getComponents(): List<Component> {
        return components
    }

    override val price: Int
        get() = components.stream().mapToInt { obj: Component -> obj.price }.sum()
}
