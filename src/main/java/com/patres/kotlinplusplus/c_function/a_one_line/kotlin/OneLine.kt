package com.patres.kotlinplusplus.c_function.a_one_line.kotlin


public fun isWoman(name: String) = name.endsWith("a")

fun canVote(age: Int) = age >= 18


fun canVote2(age: Int): Boolean {
    return age >= 18
}