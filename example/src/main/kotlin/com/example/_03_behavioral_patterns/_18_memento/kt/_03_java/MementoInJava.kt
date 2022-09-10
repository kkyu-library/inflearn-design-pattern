package com.example._03_behavioral_patterns._18_memento.kt._03_java

import com.example._03_behavioral_patterns._18_memento.kt._02_after.Game
import java.io.FileInputStream
import java.io.FileOutputStream
import java.io.ObjectInputStream
import java.io.ObjectOutputStream

fun main() {
    // TODO Serializable
    var game = Game()
    game.redTeamScore = 10
    game.blueTeamScore = 20

    FileOutputStream("GameSave.hex").use { fileOut -> ObjectOutputStream(fileOut).use { out -> out.writeObject(game) } }
    game.blueTeamScore = 25
    game.redTeamScore = 15

    FileInputStream("GameSave.hex").use { fileIn ->
        ObjectInputStream(fileIn).use { `in` ->
            game = `in`.readObject() as Game
            println(game.blueTeamScore)
            println(game.redTeamScore)
        }
    }
}
