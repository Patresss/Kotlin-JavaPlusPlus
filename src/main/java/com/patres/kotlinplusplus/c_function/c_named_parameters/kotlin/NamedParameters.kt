package com.patres.kotlinplusplus.c_function.c_named_parameters.kotlin

import com.patres.kotlinplusplus.d_classes.java.Person

fun main() {
    saveUser(notify = true, user = Person("Tom", "Apple"))
}

fun saveUser(user: Person, notify: Boolean = false) {
    if (notify) {
        sendNotification()
    }
    saveToDatabase(user)
}

fun sendNotification() {}
fun saveToDatabase(user: Person) {}
