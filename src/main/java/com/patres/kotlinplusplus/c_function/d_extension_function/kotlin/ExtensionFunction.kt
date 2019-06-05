package com.patres.kotlinplusplus.c_function.d_extension_function.kotlin


fun <T> MutableList<T>.swap(index1: Int, index2: Int) {
    val tmp = this[index1]
    this[index1] = this[index2]
    this[index2] = tmp
}

fun String.removeWhiteSpace(): String {
    return this.replace("\\s".toRegex(), "")
}

fun main() {
    val numbers = mutableListOf(1, 2, 3, 4, 5)
    numbers.swap(1, 2)
}
