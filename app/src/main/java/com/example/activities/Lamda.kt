package com.example.activities

var lambda = {println("Hello !! using lamda") }
fun higherfunc( lmbd: () -> Unit ) {
    lmbd()
}
fun main(args: Array<String>) {
    higherfunc(lambda)
}