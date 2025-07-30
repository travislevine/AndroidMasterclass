package com.github.travislevine.day3project

fun main() {
    println("Enter a number to add: ")
    val num1 = userInputInt()
    println("Enter another number to add: ")
    val num2 = userInputInt()
    val myInt = add(num2,  num1)
    println("The result of num1 + num2 is: $myInt")

    println("Enter a number to divide: ")
    val n1 = userInputDouble()
    println("Enter another number to add: ")
    val n2 = userInputDouble()
    val myDouble = divide(n1, n2)
    println("The result of num1 \\ num2 is: $myDouble")
}

fun  add(num1:Int, num2:Int): Int {
    val result =  num1 + num2
    return result
}

fun divide(num1: Double, num2: Double) : Double {
    val result = num1 / num2.toDouble()
    return result
}