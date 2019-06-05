package com.patres.kotlinplusplus.b_variables.declaration.kotlin

const val PI = 3.14
val CALCULATED_PI = calculatePi()

fun type() {
    var stringValue: String = "Value"
    val STRING_CONSTANT: String = "Const value"

    var value = "Value"
    val CONSTANT = "Const value"

    // value = 128 <- error
}

fun calculatePi(): Double {
    return 3.14
}