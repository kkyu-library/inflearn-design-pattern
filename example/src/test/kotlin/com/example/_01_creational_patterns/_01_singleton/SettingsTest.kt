package com.example._01_creational_patterns._01_singleton

import com.example._01_creational_patterns._01_singleton.kt.Settings
import org.junit.jupiter.api.Test

internal class SettingsTest {

    @Test
    fun main() {
        val settings1 = Settings
        val settings2 = Settings
        assert(settings1 == settings2)
    }
}
