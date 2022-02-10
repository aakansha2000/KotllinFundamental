package com.example.activities

fun main() {

    checkTimeForLoop { loop(1000000000) }
    checkTimeForLoopWithInline { loop(1000000000) }
}

 fun checkTimeForLoop(fn:()-> Unit) {
    val s = System.currentTimeMillis();
    fn()
    val e = System.currentTimeMillis();
    println("the time taken by without inline  function is : ${e - s} milli second")
}

inline fun checkTimeForLoopWithInline(fn:()-> Unit) {
    val s = System.currentTimeMillis();
    fn()
    val e = System.currentTimeMillis();
    println("the time taken by with inline  function is : ${e - s} milli second")
}

fun loop(n:Int)
{
    for(i in 1..n)
    {
        val a:Int=9
    }
}