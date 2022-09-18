package com.example._03_behavioral_patterns._23_visitor.kt._03_java

import java.io.IOException
import java.nio.file.FileVisitResult
import java.nio.file.FileVisitor
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.attribute.BasicFileAttributes

class SearchFileVisitor(private val fileToSearch: String, private val startingDirectory: Path) : FileVisitor<Path> {
    @Throws(IOException::class)
    override fun preVisitDirectory(dir: Path, attrs: BasicFileAttributes): FileVisitResult {
        return FileVisitResult.CONTINUE
    }

    @Throws(IOException::class)
    override fun visitFile(file: Path, attrs: BasicFileAttributes): FileVisitResult {
        if (fileToSearch == file.fileName.toString()) {
            println("found " + file.fileName)
            return FileVisitResult.TERMINATE
        }
        return FileVisitResult.CONTINUE
    }

    @Throws(IOException::class)
    override fun visitFileFailed(file: Path, exc: IOException): FileVisitResult {
        exc.printStackTrace(System.out)
        return FileVisitResult.CONTINUE
    }

    @Throws(IOException::class)
    override fun postVisitDirectory(dir: Path, exc: IOException): FileVisitResult {
        if (Files.isSameFile(startingDirectory, dir)) {
            println("search end")
            return FileVisitResult.TERMINATE
        }
        return FileVisitResult.CONTINUE
    }
}
