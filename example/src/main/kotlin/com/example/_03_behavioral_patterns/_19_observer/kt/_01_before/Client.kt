package com.example._03_behavioral_patterns._19_observer.kt._01_before

fun main() {
    val chatServer = ChatServer()

    val user1 = User(chatServer)
    user1.sendMessage("디자인패턴", "이번엔 옵저버 패턴입니다.")
    user1.sendMessage("롤드컵2021", "LCK 화이팅!")

    val user2 = User(chatServer)
    println(user2.getMessage("디자인패턴"))

    user1.sendMessage("디자인패턴", "예제 코드 보는 중..")
    println(user2.getMessage("디자인패턴"))
}
