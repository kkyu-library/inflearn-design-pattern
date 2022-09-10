package com.example._03_behavioral_patterns._20_state.kt._01_before

fun main() {
    val student = Student("whiteship")
    val onlineCourse = OnlineCourse()

    val keesun = Student("keesun")
    keesun.addPrivateCourse(onlineCourse)

    onlineCourse.addStudent(student)
    onlineCourse.changeState(OnlineCourse.State.PRIVATE)

    onlineCourse.addStudent(keesun)

    onlineCourse.addReview("hello", student)

    println(onlineCourse.state)
    println(onlineCourse.getStudents())
    println(onlineCourse.getReviews())
}
