package com.daon.compose_pra.fundamentals

fun main(){
    for (num in 1..10){
        println("$num")
    }

    for (i in 1 until 10){
        println("$i")
    }

    println("_________\n")
    for (i in 10 downTo 1 step 2){
        println("$i")
    }
}