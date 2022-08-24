package com.example._02_structural_patterns._06_adapter.kt._02_after.security

interface UserDetailsService {
    fun loadUser(username: String): UserDetails
}
