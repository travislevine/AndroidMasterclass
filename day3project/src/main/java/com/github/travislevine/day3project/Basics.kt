package com.github.travislevine.day3project

fun main() {


}

fun askCoffeeDetails () {
    println("Who is this coffee for? ")
    var name = readln()
    println("How many spoons of sugar do you want? ")
    var sugarCount = readln().toInt()
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
