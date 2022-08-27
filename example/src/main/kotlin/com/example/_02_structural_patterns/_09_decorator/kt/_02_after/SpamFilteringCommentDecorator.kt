package com.example._02_structural_patterns._09_decorator.kt._02_after

class SpamFilteringCommentDecorator(
    commentService: CommentService
) : CommentDecorator(commentService) {

    override fun addComment(comment: String) {
        if (isNotSpam(comment)) {
            super.addComment(comment)
        }
    }

    private fun isNotSpam(comment: String): Boolean {
        return !comment.contains("http")
    }
}
