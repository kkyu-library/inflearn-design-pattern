package com.example._03_behavioral_patterns._20_state.kt._02_after

class Student(
    private val name: String,
    private val onlineCourses: MutableSet<OnlineCourse> = HashSet()
) {
    fun isAvailable(onlineCourse: OnlineCourse): Boolean {
        return onlineCourses.contains(onlineCourse)
    }

    fun addPrivate(onlineCourse: OnlineCourse) {
        onlineCourses.add(onlineCourse)
    }

    override fun toString(): String {
        return "Student{" +
                "name='" + name + '\'' +
                '}'
    }
}
