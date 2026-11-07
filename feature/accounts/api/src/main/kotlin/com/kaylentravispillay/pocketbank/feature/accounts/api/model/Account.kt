package com.kaylentravispillay.pocketbank.feature.accounts.api.model

import com.kaylentravispillay.pocketbank.feature.accounts.api.type.AccountId
import com.kaylentravispillay.pocketbank.feature.accounts.api.type.CurrencyCode

data class Account(
    val id: AccountId,
    val currencyCode: CurrencyCode,
    val amountMinor: Long
)