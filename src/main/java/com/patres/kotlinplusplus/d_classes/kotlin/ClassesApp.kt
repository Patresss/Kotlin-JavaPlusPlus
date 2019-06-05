package com.patres.kotlinplusplus.d_classes.kotlin

import com.patres.kotlinplusplus.d_classes.java.Property


fun main() {
    val person = Person("Tom", "Apple")
    val (name, surname) = person // componentN()
    person.equals(person)
    person.hashCode()
    person.copy()
    person.toString() // Person(name=Tom, surname=Apple)

    val person1 = Person("Tom", "Apple")
    val person2 = Person("Tom", "Apple")

    println(person1 == person2)
    println(person1 === person2)


    println("$name $surname")

    val property = Property()
    property.value = "New value"
    property.key = "New key"


    println(Property.VERSION)


}

