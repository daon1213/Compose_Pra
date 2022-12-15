package com.daon.compose_pra.oop

import android.os.Build.VERSION_CODES.P

fun main() {
    val stringList: List<String> = listOf(
        "Daon", "Gunwoo"
    )
    val mixedTypeList: List<Any> = listOf(
        "Daon", 12, 3, "BDay", 68.0, "weights", "Kg"
    )

    for (value in mixedTypeList) {
        if (value is Int) {
            println(value is Double)
        } else if (value is Double) {
            println("Double: '$value' with Floor value ${
                Math.floor(value)}")
        } else if (value is String) {
            println("String: '$value' of length ${
                value.length}")
        } else {
            println("Unknown Type")
        }
    }

    // Alternatively
    for (value in mixedTypeList) {
        when(value) {
            is Int -> println("Integer: $value")
            is Double -> println("Double: $value with Floor value ${Math.floor(value)}")
            is String -> println("String: $value of length ${value.length}")
            else -> println("Unknown Type")
        }
    }

    // SMART CAST
    val obj1: Any = "I have a dream"
    if (obj1 !is String) {
        println("Not a String")
    } else {
        println("Found a String of length ${obj1.length}")
    }

    val str1: String = obj1 as String
    println(str1.length)

    val obj2: Any = 1337
//    val str2: String? = obj2 as? String
//    println(str2)

    val obj3: Any = 1337
    val str3: String? = obj3 as? String
    println(str3)
}