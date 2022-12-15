package com.daon.compose_pra.oop

abstract class Mammal(
    private val name: String, private val origin: String,
    private val weight: Double,
) {
    abstract var maxSpeed: Double

    abstract fun run()
    abstract fun breath()

    fun displayDetails() {
        println("Name: $name, Origin: $origin, Weight: $weight, " +
                "Max Speed: $maxSpeed")
    }
}

class Human(
    name: String, origin: String, weight: Double,
    override var maxSpeed: Double,
) : Mammal(name, origin, weight) {
    override fun run() {
        println("Runs on two legs")
    }

    override fun breath() {
        println("Breath through mouth or nose")
    }
}

class Elephant(name: String, origin: String, weight: Double,
               override var maxSpeed: Double): Mammal(name, origin, weight) {
    override fun run() {
        println("Runs on four legs")
    }

    override fun breath() {
        println("Breath through the trunk")
    }
}

fun main(){
    val human = Human("Daon", "Korea", 68.0, 25.0)
    val elephant = Elephant("Zambo", "Af", 5400.0, 23.0)

    human.run()
    elephant.run()

    human.breath()
    elephant.breath()
}