package com.example._02_structural_patterns._06_adapter.kt._02_after

import com.example._02_structural_patterns._06_adapter.kt._02_after.security.UserDetails
import com.example._02_structural_patterns._06_adapter.kt._02_after.security.UserDetailsService

class AccountUserDetailsService(
    private val accountService: AccountService
) : UserDetailsService {

    override fun loadUser(username: String): UserDetails {
        return AccountUserDetails(accountService.findAccountByUsername(username))
    }
}
