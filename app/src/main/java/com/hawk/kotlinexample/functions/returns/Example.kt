package com.hawk.kotlinexample.functions.returns

// Example: Returning Two Values from a Function
// Let's say we need to return two things from a function. For example, a result object and a status of some sort.
// A compact way of doing this in Kotlin is to declare a data class and return its instance:
data class Result(val result: Int, val status: Boolean)
fun function(a: Int, b: Int): Result {
    // computations
    var result: Int = a+b
    var status: Boolean = false
    /**
        if (a==b)
            status = true
        else
            status = false
     */
    status = a==b

    return Result(result, status)
}

fun main(args: Array<String>) {
    val (result, status) = function(2, 2)
    println("result=${result}, status=${status}")
}