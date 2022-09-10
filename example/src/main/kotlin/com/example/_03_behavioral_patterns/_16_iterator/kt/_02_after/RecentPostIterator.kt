package com.example._03_behavioral_patterns._16_iterator.kt._02_after

import com.example._03_behavioral_patterns._16_iterator.kt._01_before.Post


class RecentPostIterator(
    posts: List<Post>
) : MutableIterator<Post> {
    private val internalIterator: Iterator<Post> = posts.iterator()

    override fun hasNext(): Boolean {
        return internalIterator.hasNext()
    }

    override fun next(): Post {
        return internalIterator.next()
    }

    override fun remove() {
        TODO("Not yet implemented")
    }
}

