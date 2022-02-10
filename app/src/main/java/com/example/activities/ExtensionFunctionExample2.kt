package com.example.activities

fun main() {
    var str:String="happy"
   var str2= str.showWithZeroInTheEnd(str)
    println(str2)
}

fun String.showWithZeroInTheEnd(str:String):String{
    return str+"000000"
}