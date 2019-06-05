package com.patres.kotlinplusplus.c_function.b_default_parameters.kotlin

import com.patres.kotlinplusplus.d_classes.java.Person

fun main() {
    saveUser(Person("Tom", "Apple"))
}

fun saveUser(user: Person, notify: Boolean) {
    if (notify) {
        sendNotification()
    }
    saveToDatabase(user)
}

fun saveUser(user: Person) {
    saveUser(user, true)
}


fun sendNotification() {}
fun saveToDatabase(user: Person) {}
