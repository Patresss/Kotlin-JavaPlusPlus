package com.patres.kotlinplusplus.f_delegate.kotlin

import java.lang.Thread.sleep
import kotlin.properties.Delegates.observable

val price: Int by lazy {
    sleep(1000)
    10000
}

var priceObserbavle: Int by observable(0) { property, oldValue, newValue ->
    println("Old: $oldValue | new: $newValue")
}

//var name: String by Delegates.observable("<no name>") { prop, old, new ->
//    println("$old -> $new")
//}

fun main() {
    val sum = 3 * price + 2 * price
    println(sum)
}


private fun calculatePrice(): Int {
    println("Loading...")
    return 10000
}


fun load() = 1