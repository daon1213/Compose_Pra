package com.daon.compose_pra.fundamentals

fun main() {
    // imutable variable

    // type string
    var myName = "Daon"

    // type int <- 32 bit 메모리 할당 가능
    var myAge = 18
    // 코틀린에서는 변수 선언 시 타입 지정을 해주지 않아도 자동으로 값에 따른 타입을 지정해준다.
    // 이것을 유형 추론이라고 한다.

    // Integer Types: Byte (8 bit), Short (16 bit), Int (32 bit), Long (64 bit)
    val myByte: Byte = 13
    val myShort: Short = 125
    val myInt: Int = 123123123
//    val myLong: Long = 12_039_812_309_487_120_394 <- 64bit의 메모리를 넘겼으므로 지정 불가능, 오류 발생

    // Floating Point number Types: Float (32 bit), Double (64 bit)
//    val myFloat: Float = 13.37 // 부동 소수점 값을 할당하면 일반적으로 double 할당으로 가정
    // 범위가 더 낮은 float을 명시적으로 사용하려면?
    val myFloat1: Float = 13.37F // F를 붙여 float 타입인 것을 명시

    val myDouble: Double = 3.14159265358979323846
}