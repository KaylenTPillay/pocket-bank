package com.kaylentravispillay.pocketbank.feature.accounts.api

data class Account(
    val id: String,
    val currencyCode: String,
    val amountMinor: Long
)
