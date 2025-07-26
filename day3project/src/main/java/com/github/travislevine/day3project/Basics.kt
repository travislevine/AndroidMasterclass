package com.github.travislevine.day3project

fun main() {
    makeCoffee(1, "Travis")
    makeCoffee(3, "Ting")
    makeCoffee(0, "Leo")

}


fun makeCoffee(sugarCount : Int, name : String){
    if (sugarCount == 1)
    println("Coffee with $sugarCount spoon of sugar for $name")
    else if (sugarCount > 1)
        println("Coffee with $sugarCount spoons of sugar for $name")
    else if (sugarCount == 0) {
        println("Coffee with no sugar for $name")
    }
}