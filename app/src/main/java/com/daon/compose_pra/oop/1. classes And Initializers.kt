package com.daon.compose_pra.oop

fun main(){
    var daon = Person("Daon", "Onda")
    var daon1 = Person()
    var JeongOnda = Person(lastName = "Onda")
}

class Person (firstName: String = "Jeong", lastName: String = "Daon"){

    // Initializer Block
    init {
        println("Initialized a new Person object with " +
                "firstName = $firstName and lastName = $lastName")
    }
}