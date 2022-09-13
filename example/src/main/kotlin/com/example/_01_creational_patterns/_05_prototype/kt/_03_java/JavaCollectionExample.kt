package com.example._01_creational_patterns._05_prototype.kt._03_java

fun main() {
    val keesun = Student("keesun")
    val whiteship = Student("whiteship")

    val students: MutableList<Student> = ArrayList()
    students.add(keesun)
    students.add(whiteship)

    val clone: List<Student> = ArrayList(students)
    println(clone)
}
