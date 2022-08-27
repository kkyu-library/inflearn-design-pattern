package com.example._02_structural_patterns._09_decorator.kt._02_after

import org.junit.jupiter.api.Test

internal class ClientTest {

    private val enabledSpamFilter = true

    private val enabledTrimming = true

    @Test
    fun main() {
        var commentService: CommentService = DefaultCommentService()

        if (enabledSpamFilter) {
            commentService = SpamFilteringCommentDecorator(commentService)
        }

        if (enabledTrimming) {
            commentService = TrimmingCommentDecorator(commentService)
        }

        val client = Client(commentService)
        client.writeComment("오징어게임")
        client.writeComment("보는게 하는거 보다 재밌을 수가 없지...")
        client.writeComment("http://whiteship.me")
    }
}
