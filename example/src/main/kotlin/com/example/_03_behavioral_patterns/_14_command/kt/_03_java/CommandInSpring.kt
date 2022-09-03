package com.example._03_behavioral_patterns._14_command.kt._03_java

import com.example._03_behavioral_patterns._14_command.kt._02_after.Command
import org.springframework.jdbc.core.simple.SimpleJdbcInsert
import java.time.LocalDateTime
import javax.sql.DataSource

class CommandInSpring(
    private val dataSource: DataSource
) {

    fun add(command: Command) {
        val insert = SimpleJdbcInsert(dataSource)
            .withTableName("command")
            .usingGeneratedKeyColumns("id")

        val data: MutableMap<String, Any> = HashMap()
        data["name"] = command.javaClass.simpleName
        data["when"] = LocalDateTime.now()
        insert.execute(data)
    }
}
