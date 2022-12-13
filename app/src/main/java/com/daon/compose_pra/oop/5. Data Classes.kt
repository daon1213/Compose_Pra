package com.daon.compose_pra.oop

data class User(val id: Long, var name: String)

fun main(){
    val user1 = User(1, "Daon")

    user1.name = "Ahyeon"
    val user2 = User(1, "Ahyeon")

    println(user1.equals(user2))

    println("User Details: $user1")

    val updatedUser = user1.copy(name="Daon")
    println(user1)
    println(updatedUser)

    println(updatedUser.component1()) // print1
    println(updatedUser.component2()) // print Daon

    val (id, name) = updatedUser
    println("id=$id, name=$name ")
}