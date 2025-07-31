package com.github.travislevine.day3project
data class CofeeDetails(
    var sugarCount: Int,
    val name: String,
    val size: String,
    val creamAmount: Int) {

}
fun main() {
    val coffeeForDenis = CofeeDetails(1, "denis", "xxl", 0)
    makeCoffee(coffeeForDenis)
}

fun userInputInt() : Int  {
    val num = readln().toInt()
    return num
}

fun userInputDouble() : Double  {
    return readln().toDouble()
}


fun askCoffeeDetails () {
    println("Who is this coffee for? ")
    val name = readln()
    println("How many spoons of sugar do you want? ")
    val sugarCount = readln().toInt()
//    makeCoffee(sugarCount, name)

}
fun makeCoffee(theCoffee : CofeeDetails) {
    if (theCoffee.sugarCount == 1) {
        println("Coffee with ${theCoffee.sugarCount} " +
                "spoon of sugar for ${theCoffee.name} + and cream: " +
                "${theCoffee.creamAmount}")
    } else if (theCoffee.sugarCount == 0) {
        println("Coffee with no sugar for ${theCoffee.name} + and cream: " +
                "\"${theCoffee.creamAmount}\"")
    } else if (theCoffee.sugarCount > 1)
        println("Coffee with ${theCoffee.sugarCount} " +
                " spoons of sugar for ${theCoffee.name}" + "and cream: " +
    " \"${theCoffee.creamAmount}\"")
}
