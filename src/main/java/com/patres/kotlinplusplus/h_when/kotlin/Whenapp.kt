package com.patres.kotlinplusplus.h_when.kotlin

fun main() {
    println(showType(0))
    println(showType(23))
    println(showType(233))
    println(showType(Pair(1, 2)))
    println(showType("Word"))
}

private fun showType(objectToCheck: Any): String {
    return when (objectToCheck) {
        0 -> "Number: zero"
        in 10..99 -> "Two digits number"
        is Number -> "Number"
        is Pair<*, *> -> "Pair (${objectToCheck.first}, ${objectToCheck.second})"
        else -> "Unknown type"
    }
}