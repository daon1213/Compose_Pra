package com.daon.compose_pra.more_fun

fun main() {

    val fruits = setOf("Orange", "Apple", "Mango", "Grape", "Apple") // <- 이렇게 Apple을 2개 써도?
    print(fruits.size) // Size로 출력되지 않음. 즉, SetOf()는 중복을 알아서 배제한 크기를 출력한다!
    // fruits.toSortedSet() <- 정렬 시켜줌

    val newFruits = fruits.toMutableList()
    newFruits.add("Water Melon")
    newFruits.add("Pear")
    print(newFruits.elementAt(4))

    val daysOfTheWeek = mapOf(1 to "Monday", 2 to "Tuesday", 3 to "Wednesday")
    print(daysOfTheWeek[2])

    for (key in daysOfTheWeek.keys) {
        print("$key is to ${daysOfTheWeek[key]}")
    }

    val fruitsMap = mapOf("Favorite" to Fruit1("Grape", 2.5), "OK" to Fruit("Apple", 1.0))

    val newDaysOfWeek = daysOfTheWeek.toMutableMap()
    newDaysOfWeek[4] = "Thursday"
    newDaysOfWeek[5] = "Friday"

    print(newDaysOfWeek.toSortedMap())
}

data class Fruit1(val name: String, val price: Double)