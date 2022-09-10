package com.example._03_behavioral_patterns._19_observer.kt._03_java

import java.util.concurrent.Flow
import java.util.concurrent.Flow.Publisher
import java.util.concurrent.SubmissionPublisher

fun main() {
    val publisher: Publisher<String> = SubmissionPublisher()
    val subscriber: Flow.Subscriber<String> = object : Flow.Subscriber<String> {
        override fun onSubscribe(subscription: Flow.Subscription) {
            println("sub!")
            subscription.request(1)
        }

        override fun onNext(item: String) {
            println("onNext called")
            println(Thread.currentThread().name)
            println(item)
        }

        override fun onError(throwable: Throwable) {}
        override fun onComplete() {
            println("completed")
        }
    }

    publisher.subscribe(subscriber)

    (publisher as SubmissionPublisher<*>).submit("hello java" as Nothing?)
    println("이게 먼저 출력될 수도 있습니다.")
}
