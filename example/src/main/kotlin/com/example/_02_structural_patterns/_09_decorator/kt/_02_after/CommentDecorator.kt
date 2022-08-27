package com.example._02_structural_patterns._09_decorator.kt._02_after

open class CommentDecorator(
    private val commentService: CommentService
) : CommentService {

    override fun addComment(comment: String) {
        commentService.addComment(comment)
    }
}
