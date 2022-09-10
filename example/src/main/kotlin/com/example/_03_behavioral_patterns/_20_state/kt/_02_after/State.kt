package com.example._03_behavioral_patterns._20_state.kt._02_after

interface State {
    fun addReview(review: String, student: Student)
    fun addStudent(student: Student)
}
