package com.example._02_structural_patterns._06_adapter.kt._02_after

import com.example._02_structural_patterns._06_adapter.kt._02_after.security.UserDetails

class AccountUserDetails(
    account: Account
) : UserDetails {
    override val username: String = account.name
    override val password: String = account.password
}
