package com.daon.compose_pra.fundamentals

fun main() {
    var nullableName: String? = "Daon"

    val name = nullableName ?: "Guest"
    println("name is $name")

    println(nullableName!!.toLowerCase())
}