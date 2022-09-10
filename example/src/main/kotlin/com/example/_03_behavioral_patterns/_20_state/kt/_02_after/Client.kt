package com.example._03_behavioral_patterns._20_state.kt._02_after

fun main() {
    val onlineCourse = OnlineCourse()
    val student = Student("whiteship")
    val keesun = Student("keesun")
    keesun.addPrivate(onlineCourse)

    onlineCourse.addStudent(student)

    onlineCourse.changeState(Private(onlineCourse))

    onlineCourse.addReview("hello", student)

    onlineCourse.addStudent(keesun)

    println(onlineCourse.state)
    println(onlineCourse.reviews)
    println(onlineCourse.students)
}
