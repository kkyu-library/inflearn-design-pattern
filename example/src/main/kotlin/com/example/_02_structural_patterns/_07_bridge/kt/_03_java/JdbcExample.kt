package com.example._02_structural_patterns._07_bridge.kt._03_java

import java.sql.DriverManager
import java.sql.SQLException

fun main() {
    Class.forName("org.h2.Driver")
    try {
        DriverManager.getConnection("jdbc:h2:mem:~/test", "sa", "").use { conn ->
            val sql = "CREATE TABLE  ACCOUNT " +
                    "(id INTEGER not NULL, " +
                    " email VARCHAR(255), " +
                    " password VARCHAR(255), " +
                    " PRIMARY KEY ( id ))"
            val statement = conn.createStatement()
            statement.execute(sql)
        }
    } catch (e: SQLException) {
        throw RuntimeException(e)
    }
}
