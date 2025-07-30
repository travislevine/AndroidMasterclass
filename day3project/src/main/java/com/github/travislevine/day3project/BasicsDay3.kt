package com.github.travislevine.day3project

fun main() {
    println("Enter a number to add: ")
    val num1 = userInput()
    println("Enter another number to add: ")
    val num2 = userInput()
    val myInt = add(num2,  num1)
    println("The result of num1 + num2 is: $myInt")
}

fun userInput() : Int  {
    val num = readln().toInt()
    return num
}

fun  add(num1:Int, num2:Int): Int {
    val result =  num1 + num2
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
