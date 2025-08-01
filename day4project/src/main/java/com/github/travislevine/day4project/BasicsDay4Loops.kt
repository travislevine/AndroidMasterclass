package com.github.travislevine.day4project

import android.os.Build
import androidx.annotation.RequiresApi

@RequiresApi(Build.VERSION_CODES.VANILLA_ICE_CREAM)
fun main() {
    val fruits = mutableListOf("Banana", "Apple", "Peach", "Pear", "Raspberry")

    for (item in fruits) {
        println(item)

        // Jump out of loop if item found
        if (item == "Pear") {
            fruits.removeLast()
            println("Item found, exit loop")
            break
        }
    }
}
