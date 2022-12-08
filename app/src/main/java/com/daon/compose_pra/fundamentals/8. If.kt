package com.daon.compose_pra.fundamentals

fun main() {
    var heightPerson1 = 170
    var heightPerson2 = 189

    if(heightPerson1 > heightPerson2) {
        print("use raw force")
    }
    else if(heightPerson1 == heightPerson2){
        print("use your power technique 1337")
    }
    else {
        print("use technique")
    }

    val age = 17

    if(age >= 21) {
        println("now you may drink in the US")
    } else if (age >= 18){
        println("you may vote you")
    } else if (age >= 16){
        println("you may drive now")
    } else{
        print("you're too young")
    }
}