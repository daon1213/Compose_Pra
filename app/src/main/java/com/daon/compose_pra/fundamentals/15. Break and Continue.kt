package com.daon.compose_pra.fundamentals

fun main() {
    for (i in 1 until 20){
        print("$i ")
        if (i/2 == 5) {
            break
        }
    }
    print("Done with the loop")

}