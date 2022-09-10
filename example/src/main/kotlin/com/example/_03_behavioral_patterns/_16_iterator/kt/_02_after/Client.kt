package com.example._03_behavioral_patterns._16_iterator.kt._02_after

import com.example._03_behavioral_patterns._16_iterator.kt._01_before.Post

fun main() {
    val board = Board()
    board.addPost("디자인 패턴 게임")
    board.addPost("선생님, 저랑 디자인 패턴 하나 학습하시겠습니까?")
    board.addPost("지금 이 자리에 계신 여러분들은 모두 디자인 패턴을 학습하고 계신 분들입니다.")

    // TODO 들어간 순서대로 순회하기
    val posts = board.posts
    val iterator: Iterator<Post> = posts.iterator()
    println(iterator.javaClass)
    for (post in posts) {
        println(post.title)
    }

    // TODO 가장 최신 글 먼저 순회하기
    val recentPostIterator = board.recentPostIterator
    while (recentPostIterator.hasNext()) {
        println(recentPostIterator.next().title)
    }
}
