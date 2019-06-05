package com.patres.kotlinplusplus.d_classes.kotlin

class Property {

    companion object {
        const val VERSION = "1.0"
    }

    var key = "key"
        set(name) {
            field = name
            printMessageAboutUpdate()
        }
    var value = "value"
        set(value) {
            field = value
            printMessageAboutUpdate()
        }

    private fun printMessageAboutUpdate() {
        println("Property was updated {key: " + this.key + ", value: " + this.value + "}")
    }
}
