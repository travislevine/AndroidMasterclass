package com.github.travislevine.day4project

fun main() {
    // Mutable list
    val fruits = mutableListOf("Banana", "Apple", "Peach", "Pear", "Raspberry")

    // Add a new fruit to the list
    fruits.add("Cherry")

    // Remove a fruit at the last index
    fruits.removeAt(4)

    // Check if a specific fruit is in the list
    if (fruits.contains("Peach")) {
        println("The list contains a Peach")
    } else {
        println("No peach in the list")
    }
    println(fruits)
}

