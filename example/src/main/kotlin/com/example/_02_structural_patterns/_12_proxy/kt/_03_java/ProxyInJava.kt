package com.example._02_structural_patterns._12_proxy.kt._03_java

import com.example._02_structural_patterns._12_proxy.kt._02_after.DefaultGameService
import com.example._02_structural_patterns._12_proxy.kt._02_after.GameService
import java.lang.reflect.Method
import java.lang.reflect.Proxy

class ProxyInJava {

    fun dynamicProxy() {
        val gameServiceProxy = getGameServiceProxy(DefaultGameService())
        gameServiceProxy.startGame()
    }

    private fun getGameServiceProxy(target: GameService): GameService {
        return Proxy.newProxyInstance(
            this.javaClass.classLoader,
            arrayOf<Class<*>>(GameService::class.java)
        ) { _: Any?, method: Method, args: Array<Any?> ->
            println("O")
            method.invoke(target, *args)
            println("ㅁ")
            null
        } as GameService
    }
}

fun main() {
    val proxyInJava = ProxyInJava()
    proxyInJava.dynamicProxy()
}
