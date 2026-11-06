package com.kaylentravispillay.pocketbank.feature.accounts.api

interface AccountsRepository {
    suspend fun getAccounts(): List<Account>
}
