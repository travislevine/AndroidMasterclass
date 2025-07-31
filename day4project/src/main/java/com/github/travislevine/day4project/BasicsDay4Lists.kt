package com.github.travislevine.day4project

fun main() {
    // Immutable list - cannot add items after initialisation
    val shoppingListImmutable = listOf("Processor", "RAM", "Graphics Card", "SSD")

    // Mutable list - can add items later and modify
    val shoppingList = mutableListOf("Processor", "RAM", "Graphics Card RTX 3060", "SSD")

    // adding items to the list
    shoppingList.add("Cooling System")

    // Remove an old item
    shoppingList.remove("Graphics Card RTX 3060")

    // Add a replacement item
    shoppingList.add("Graphics Card RTX 5090")

    println(shoppingList)
}