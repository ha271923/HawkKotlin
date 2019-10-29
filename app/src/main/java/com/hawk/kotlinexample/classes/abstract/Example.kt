package com.hawk.kotlinexample.classes.abstract

fun main(args: Array<String>) {
    val dog = Dog()
    dog.run()

    val cat = Cat("Ketty")
    println(cat.name)
}