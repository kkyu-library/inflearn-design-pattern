package com.example._02_structural_patterns._06_adapter.kt._01_before

class AccountService {

    fun findAccountByUsername(username: String): Account {
        return Account(
            name = username, password = username, email = username
        )
    }

    fun createNewAccount(account: Account) {}
    fun updateAccount(account: Account) {}
}
