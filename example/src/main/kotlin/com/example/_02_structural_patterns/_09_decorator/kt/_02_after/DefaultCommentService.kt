package com.example._02_structural_patterns._09_decorator.kt._02_after

class DefaultCommentService : CommentService {

    override fun addComment(comment: String) {
        println(comment)
    }
}
