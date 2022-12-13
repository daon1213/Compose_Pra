package com.daon.compose_pra.oop

// lateinit + setter and getter

fun main() {
    var myCar = Car()
    println("brand is : ${myCar.myBrand}")
    myCar.maxSpeed = 200
    println("Maxspeed is ${myCar.maxSpeed}")
    println("Model is ${myCar.myModel}")
}

class Car() {
    lateinit var owner: String

    val myBrand: String = "KIA"
        // Custom getter
        get() {
            return field.toLowerCase()
        }

    var maxSpeed: Int = 250
        // get() = field
        set(value) {
            field =
                if (value > 0) value else throw java.lang.IllegalArgumentException("Maxspeed cannot be less than 0")
        }

    var myModel : String = "K5"
        private set

    init {
        this.myModel = "K8"
        this.owner = "Daon"
    }
}