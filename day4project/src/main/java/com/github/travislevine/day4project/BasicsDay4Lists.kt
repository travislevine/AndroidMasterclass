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

    // Use index removal
    shoppingList.removeAt(2)
    shoppingList.removeAt(1)
    println(shoppingList)

    // Add items back with index
    shoppingList.add(2, "RAM")
    println(shoppingList)

    // Remove items with raw index
    shoppingList[3] = " Graphics Card 9800XT"
    println(shoppingList)

    // Replace items with the set method
    shoppingList.set(1, "Air Cooling")
    println(shoppingList)

    // Check if Processor is in the list
    if (shoppingList.contains("Processor")) {
        println("The list contains a Processor")
    } else {
        println("The list does not contain a processor")
    }
}