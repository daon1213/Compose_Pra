package com.daon.compose_pra.fundamentals

fun main(){
    var name: String = "Daon"
    // name = null -> Compilation ERROR
    var nullableName : String? = "Daon"
    // nullableName = null

    var len = name.length
    /*
    if (nullableName != null){
        var len2 = nullableName.length
    }else{
        null
    }
    */

    var len2 = nullableName?.length
    println(nullableName?.toLowerCase())
    nullableName?.let { println(it.length) }
}