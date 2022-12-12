package com.daon.compose_pra.oop

fun main(){
    var daon = Person1("Jeong", "Daon", 18)
    daon.hobby = "Watching BaseBall"
    daon.age = 19
    println("Daon is ${daon.age} years old")
    daon.stateHobby()
    daon.hobby = "Coding"
    daon.stateHobby()
}

class Person1 (firstName: String = "Jeong", lastName: String = "Daon"){

    // Member Variables - Properties
    var age : Int? = null
    var hobby : String = "Playing Game"
    var lastName : String? = null

    // Initializer Block
    init {
        this.lastName = lastName
        println("Initialized a new Person object with " +
                "firstName = $firstName and lastName = $lastName")
    }
    // Member secondary Constructor
    constructor(firstName: String, lastName: String, age: Int)
            : this(firstName, lastName){
                this.age = age
                println("Initialized a new Person object with " +
                        "firstName = $firstName and lastName = $lastName and age $age")
            }

    // Member functions - Method
    fun stateHobby(){
        println("$lastName\'s hobby is $hobby")
    }
}