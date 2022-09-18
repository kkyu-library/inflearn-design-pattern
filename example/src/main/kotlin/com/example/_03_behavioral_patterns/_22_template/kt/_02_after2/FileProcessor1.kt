package com.example._03_behavioral_patterns._22_template.kt._02_after2

import java.io.BufferedReader
import java.io.FileReader
import java.io.IOException

class FileProcessor(private val path: String) {

    fun process(operator: (Int, Int) -> Int): Int {
        try {
            BufferedReader(FileReader(path)).use { reader ->
                var result = 0
                var line: String
                while (reader.readLine().also { line = it } != null) {
                    result = operator.invoke(result, line.toInt())
                }
                return result
            }
        } catch (e: IOException) {
            throw IllegalArgumentException(path + "에 해당하는 파일이 없습니다.", e)
        }
    }
}
