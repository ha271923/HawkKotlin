package com.hawk.kotlinexample.classes.nested

// 1. Classes can be nested in other classes:
class Outer {
    private val bar: Int = 1
    class Nested {
        fun foo() = 2
    }
}

val demo = Outer.Nested().foo() // == 2


// 2. Inner classes
//      A nested class marked as inner can access the members of its outer class.
//      Inner classes carry a reference to an object of an outer class:
class Outer2 {
    private val bar: Int = 1
    inner class Inner {
        fun foo() = bar
    }
}

val demo2 = Outer2().Inner().foo() // == 1

// 3. Anonymous inner classes
//      Anonymous inner class instances are created using an object expression:
//
//    window.addMouseListener(object : MouseAdapter() {
//            override fun mouseClicked(e: MouseEvent) { ... }
//            override fun mouseEntered(e: MouseEvent) { ... }
//        }
//    )
//    val listener = ActionListener { println("clicked") }