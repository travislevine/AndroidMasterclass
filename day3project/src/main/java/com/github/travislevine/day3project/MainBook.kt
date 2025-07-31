package com.github.travislevine.day3project

fun main() {
    var aBook = Book()
    println("${aBook.author}, ${aBook.title}, ${aBook.author}")
    val customBook = Book("Custom", "Dipsum", "1999")
    println("${customBook.author}, ${customBook.title}, ${customBook.author}")

}
