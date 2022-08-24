package com.example._02_structural_patterns._06_adapter.kt._02_after.security

class LoginHandler(
    private var userDetailsService: UserDetailsService
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
