package com.example._03_behavioral_patterns._20_state.kt._01_before

class Student(
    private val name: String
) {
    private val privateCourses: MutableList<OnlineCourse> = ArrayList()

    fun isEnabledForPrivateClass(onlineCourse: OnlineCourse): Boolean {
        return privateCourses.contains(onlineCourse)
    }

    fun addPrivateCourse(onlineCourse: OnlineCourse) {
        privateCourses.add(onlineCourse)
    }

    override fun toString(): String {
        return "Student{" +
                "name='" + name + '\'' +
                '}'
    }
}
