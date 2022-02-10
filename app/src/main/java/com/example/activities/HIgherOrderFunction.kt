package com.example.activities

fun addThree(a:Int,b:Int,c:Int):Int
{
    var res=a+b+c
    return res
}

fun higherAddFnc(addThree:(Int,Int,Int)->Int)
{
    var res=addThree(2,3,4)
    print("The higher order result would result  ${res}")
}

fun main() {
    higherAddFnc(::addThree)
}