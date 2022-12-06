package com.daon.compose_pra.fundamentals

fun main(){
    var myName = "Daon"
    myName ="Onda" // 이렇게 덮어쓰기가 가능하다.

    val myName1 = "Daon"
//    myName1 = "Onda" // 코드 작성 시 val을 var로 변환하라고 경고를 줌.

//    즉, var과 val의 차이점은 var은 변수를 덮어쓸 수 있지만, val은 불가능하다.

//    그러므로 코드 작성 시, 재정의 할 변수는 var로 생성 / 고정 변수는 val로 생성한다.

    print("Hello " + myName)
}