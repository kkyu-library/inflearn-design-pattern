package com.example._02_structural_patterns._09_decorator.kt._01_before

class SpamFilteringCommentService : CommentService() {

    override fun addComment(comment: String) {
        val isSpam = isSpam(comment)
        if (!isSpam) {
            super.addComment(comment)
        }
    }

    private fun isSpam(comment: String): Boolean {
        return comment.contains("http")
    }
}
