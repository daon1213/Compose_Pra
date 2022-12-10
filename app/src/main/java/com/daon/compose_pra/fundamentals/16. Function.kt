package com.daon.compose_pra.fundamentals

fun main() {
    myFunction()
    var result = addUp(5, 3)
    print("result is " + result)

    var avg = avg(5.3, 13.37)
    print("result os $avg")
}

fun myFunction(){
    print("Called from myFunction")
}

fun addUp(a: Int, b: Int): Int{
    return a+b
}

fun avg(a: Double, b: Double): Double{
    return (a+b)/2
}