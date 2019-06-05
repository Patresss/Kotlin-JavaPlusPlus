package com.patres.kotlinplusplus.b_variables.optional.kotlin

import com.patres.kotlinplusplus.b_variables.optional.java.Person

fun main() {
    val person: Person = Person()
    //person = null // <- throw


    var personNotNullable: Person = Person()
//    personNotNullable = null // <- error
    val personNullable: Person? = null

    getCountryNullable(personNotNullable)
    getCountryNullable(personNullable)
    getCountryNotNullable(personNotNullable)
//getCountryNotNullable(personNullable) // <- error
}

// ...
private fun getCountryNullable(person: Person?): String {
    return person?.address?.country ?: "UNKNOWN"
}

private fun getCountryNotNullable(person: Person): String {
    return person.address?.country ?: "UNKNOWN"
}

