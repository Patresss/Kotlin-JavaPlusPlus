package com.patres.kotlinplusplus.c_function.e_infix.kotlin


fun main() {
    val usdPrice = 5.00 euroTo "USD"
    val usdPrice2 = 5.00.euroTo("USD")
    val map = mapOf(1 to "one", 2 to "two", 3 to "three")

    val pair = 1 to "a"

}

private infix fun Double.euroTo(currency: String): String {
    val money = when (currency) {
        "USD" -> this * 1.12
        "PLN" -> this * 4.30
        else -> throw Exception("Currency not found")
    }
    return String.format("%.2f", money)
}

