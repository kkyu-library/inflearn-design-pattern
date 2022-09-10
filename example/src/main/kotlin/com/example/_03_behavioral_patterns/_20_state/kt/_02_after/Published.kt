package com.example._03_behavioral_patterns._20_state.kt._02_after

class Published(
    private val onlineCourse: OnlineCourse
) : State {

    override fun addReview(review: String, student: Student) {
        onlineCourse.reviews.add(review)
    }

    override fun addStudent(student: Student) {
        onlineCourse.students.add(student)
    }
}
