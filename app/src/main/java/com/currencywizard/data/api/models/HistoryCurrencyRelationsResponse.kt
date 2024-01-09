package com.currencywizard.data.api.models

data class HistoryCurrencyRelationsResponse(
    val amount: Int,
    val base: String,
    val start_date: String,
    val end_date: String,
    val rates: Map<String, Map<String, Double>>
)