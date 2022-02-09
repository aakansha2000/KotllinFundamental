package com.example.activities

import android.util.Log

fun main(args: Array<String>) {
    var student = Student()
    println("pass status " + student.hasPassed(57))
    println("scholarship  status " + student.isScholar(57))

}

fun Student.isScholar(marks: Int): Boolean {
    return marks>95
}

class Student {
    fun hasPassed(marks: Int): Boolean {
        return marks > 40
    }
}