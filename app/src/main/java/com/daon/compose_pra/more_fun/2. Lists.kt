package com.daon.compose_pra.more_fun

fun main(){
    val months = listOf("January", "February", "March")
    val anyTypes = listOf(1, 2, 3, true, false, "String")
    // print(anyTypes.size)
    // print(months[1])

//    for (month in months){
//        println(month)
//    }

    val addionalMonths = months.toMutableList()
    val newMonths = arrayOf("April", "May", "June")
    addionalMonths.addAll(newMonths)
    addionalMonths.add("July")
    // print(addionalMonths)

    val days = mutableListOf<String>("Mon", "Tue", "Wed")
    days.add("Thu")
    days[2] = "Sunday"
    // days.removeAt(3)
    val removeList = mutableListOf<String>("Mon", "Wed")
    // days.removeAll(removeList)
    days.removeAll(days)
    print(days)
}