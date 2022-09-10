package com.example._03_behavioral_patterns._20_state.kt._02_after

class OnlineCourse(
    val students: MutableList<Student> = ArrayList(),
    val reviews: MutableList<String> = ArrayList(),
) {
    var state: State = Draft(this)
        private set


    fun addStudent(student: Student) {
        state.addStudent(student)
    }

    fun addReview(review: String, student: Student) {
        state.addReview(review, student)
    }

    fun changeState(state: State) {
        this.state = state
    }
}
