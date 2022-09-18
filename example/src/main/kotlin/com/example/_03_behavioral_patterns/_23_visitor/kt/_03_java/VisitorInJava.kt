package com.example._03_behavioral_patterns._23_visitor.kt._03_java

import java.io.IOException
import java.nio.file.Files
import java.nio.file.Path

object VisitorInJava {
    @Throws(IOException::class)
    @JvmStatic
    fun main(args: Array<String>) {
        val startingDirectory = Path.of("/Users/keesun/workspace/design-patterns")
        val searchFileVisitor = SearchFileVisitor("Triangle.java", startingDirectory)
        Files.walkFileTree(startingDirectory, searchFileVisitor)
    }
}
