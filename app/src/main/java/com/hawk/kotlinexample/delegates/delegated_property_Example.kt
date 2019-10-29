package com.hawk.kotlinexample.delegates

/**
 委托属性(Delegated Property):
   延迟加载属性(lazy property): 属性值只在初次访问时才会计算;
   可观察属性(observable property): 属性发生变化时, 可以向监听器发送通知;
   将多个属性保存在一个 map 内, 而不是将每个属性保存在一个独立的域内.
 */
class LazyProperty {
    val lazy: Int by lazy {
        println("Calculate the value")
        42
    }

    val notLazy = 10
}

fun main(args: Array<String>) {

    println("--- creation ---")
    val property = LazyProperty()

    println("--- normal property --- ${property.notLazy}")

    println("--- first access to lazy property --- ${property.lazy}")

    println("--- second access to lazy property --- ${property.lazy}")
}