package com.example._03_behavioral_patterns._19_observer.kt._03_java

import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.context.ApplicationEventPublisher
import org.springframework.stereotype.Component

@Component
class MyRunner(
    private val publisher: ApplicationEventPublisher
) : ApplicationRunner {

    override fun run(args: ApplicationArguments) {
        publisher.publishEvent(MyEvent("hello spring event"))
    }
}
