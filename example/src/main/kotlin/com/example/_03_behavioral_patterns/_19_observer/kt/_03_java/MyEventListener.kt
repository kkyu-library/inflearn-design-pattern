package com.example._03_behavioral_patterns._19_observer.kt._03_java

import org.springframework.context.event.EventListener
import org.springframework.stereotype.Component

@Component
class MyEventListener {

    @EventListener(MyEvent::class)
    fun onApplicationEvent(event: MyEvent) {
        println(event.message)
    }
}
