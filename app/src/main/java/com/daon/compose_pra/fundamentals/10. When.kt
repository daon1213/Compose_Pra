package com.daon.compose_pra.fundamentals

fun main() {
    var season = 3
    when(season){
        in 3..5 -> println("Spring")
        in 6..8 -> println("Summer")
        in 9..11 -> println("Fall")
        in 12..2 -> println("Winter")
        else -> println("Invalid Season")
    }

    var age = 18
    when(age){
        in 8..13 -> println("Elementary School")
        in 14..16 -> println("Middle School")
        in 17..19 -> println("High School")
        else -> println("Work or University Students")
    }

    var x : Any = 13.37
    when(x){
        is Int -> println("$x is an Int")
        is Double -> println("$x is a Double")
        is String -> println("$x is a String")
        else -> println("$x is none of the above")
    }
}