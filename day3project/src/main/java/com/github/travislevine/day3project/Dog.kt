package com.github.travislevine.day3project

class Dog(val name: String, val breed: String, val age: Int = 0) {
   init {
       Bark()
   }

    fun Bark() {
        println("The dog is called $name, it is a $breed and is $age yrs old: Bark bark")
    }
}