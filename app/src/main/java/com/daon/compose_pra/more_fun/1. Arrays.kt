package com.daon.compose_pra.more_fun

fun main() {

    // val numbers:IntArray = intArrayOf(1, 2, 3, 4, 5, 6)

    // val numbers = intArrayOf(1, 2, 3, 4, 5, 6)

    val numbers = arrayOf(1, 2, 3, 4, 5, 6)
    val numbersD: DoubleArray = doubleArrayOf(1.0, 2.0, 3.0, 4.0, 5.0, 6.0)
    val days = arrayOf("Sun", "Mon", "Tues", "Wed", "Thurs", "Fri", "Sat")
    val fruits = arrayOf(Fruit("Apple", 2.5), Fruit("Grape", 3.5))
    val mix = arrayOf("Daon", 12, 1.3)
    print("initial values ${numbers.contentToString()}")

    for (element in numbers) {
        print(" ${element + 2}")
    }

    for (element in numbers) {
        print(" $element")
    }

    print(numbers[0])

    numbers[0] = 6
    numbers[1] = 5
    numbers[4] = 2
    numbers[5] = 1

    print("\nfinal values ${numbers.contentToString()}")

    print("Double initial values ${numbersD.contentToString()}")

    numbersD[0] = 6.0
    numbersD[1] = 5.0
    numbersD[4] = 2.0
    numbersD[5] = 1.0

    println("Double final values ${numbersD.contentToString()}")

    println(days.contentToString())


    println(fruits.contentToString())

    for (index in fruits.indices) {
        print("${fruits[index].name} is in index $index")
    }

    for (fruit in fruits) {
        print(" ${fruit.name}")
    }

    print(mix.contentToString())

    // 장점 : 다양한 데이터를 보관 가능하다
}

data class Fruit(val name: String, val price: Double)