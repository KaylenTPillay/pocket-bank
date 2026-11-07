package com.kaylentravispillay.pocketbank.feature.accounts.api.repository

import com.kaylentravispillay.pocketbank.feature.accounts.api.model.Account

interface AccountsRepository {
    suspend fun getAccounts(): List<Account>
}
