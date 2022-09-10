package com.example._03_behavioral_patterns._16_iterator.kt._02_after

import com.example._03_behavioral_patterns._16_iterator.kt._01_before.Post

class Board(
    val posts: MutableList<Post> = ArrayList()
) {
    fun addPost(content: String) {
        posts.add(Post(content))
    }

    val recentPostIterator: Iterator<Post>
        get() = RecentPostIterator(posts)
}
