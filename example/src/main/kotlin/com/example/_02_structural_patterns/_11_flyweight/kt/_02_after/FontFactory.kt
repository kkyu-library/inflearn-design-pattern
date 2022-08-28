package com.example._02_structural_patterns._11_flyweight.kt._02_after

class FontFactory(
    private val cache: MutableMap<String, Font> = HashMap()
) {

    fun getFont(font: String): Font {
        return checkNotNull(cache[font]) {
            val split = font.split(":".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
            val newFont = Font(family = split[0], size = split[1].toInt())
            cache[font] = newFont
            return newFont
        }
    }
}
