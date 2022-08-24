package com.example._02_structural_patterns._06_adapter.kt._01_before.security

class LoginHandler(
    private val userDetailsService: UserDetailsService
) {
    fun login(username: String, password: String): String {
        val userDetails = userDetailsService.loadUser(username)
        return if (userDetails.password == password) {
            userDetails.username
        } else {
            throw IllegalArgumentException()
        }
    }
}
