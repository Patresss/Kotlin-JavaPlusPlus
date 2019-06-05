package com.patres.kotlinplusplus.e_string.a_string_interpolation.kotlin

fun main() {
    val name = "Tom"
    val surname = "Apple"
    val fullName = "$name $surname"
    println("\"$fullName\" has ${fullName.length} characters")
}
