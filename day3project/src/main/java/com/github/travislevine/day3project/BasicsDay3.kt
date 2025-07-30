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

fun userInputInt() : Int  {
    val num = readln().toInt()
    return num
}

fun userInputDouble() : Double  {
    return readln().toDouble()
}


fun  add(num1:Int, num2:Int): Int {
    val result =  num1 + num2
    return result
}

fun divide(num1: Double, num2: Double) : Double {
    val result = num1 / num2.toDouble()
    return result
}
fun askCoffeeDetails () {
    println("Who is this coffee for? ")
    val name = readln()
    println("How many spoons of sugar do you want? ")
    val sugarCount = readln().toInt()
    makeCoffee(sugarCount, name)

}
fun makeCoffee(sugarCount: Int, name: String) {
    if (sugarCount == 1) {
        println("Coffee with $sugarCount spoon of sugar for $name")
    } else if (sugarCount == 0) {
        println("Coffee with no sugar for $name")
    } else if (sugarCount > 1)
        println("Coffee with $sugarCount spoons of sugar for $name")
}
