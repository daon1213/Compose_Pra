package com.daon.compose_pra.fundamentals

fun main(){
    // Booleans 은 논리적인 가치를 나타내는 유형이다.
    // true와 false 두가지만 가능한 값을 가진다.

    var isCold: Boolean = true
    isCold = false

    // Characters <- Char의 한계 : 하나의 문자만 저장 가능
    val letterChar = 'A'
    val digitChar = '1'

    // String
    val myStr = "Hello GSM"
    var firstCharInStr = myStr[0] // firstCharInStr에 myStr의 1번째 문자(H)를 값으로 할당
    var lastCharInStr = myStr[myStr.length - 1]

    print("First character " + firstCharInStr)
    print("Last character " + lastCharInStr)
}