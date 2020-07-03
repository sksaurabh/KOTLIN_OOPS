package com.example.testing

// outer class declaration
class outerClass4 {
    var str = "Outer class"
    // innerClass declaration with using inner keyword
    inner class innerClass4 {
        var s1 = "Inner class"
        fun nestfunc(): String {
            // can access the outer class property str
            var s2 = str
            return s2
        }
    }
}
// main function
fun main(args: Array<String>) {
    // creating object for inner class
    val inner= outerClass4().innerClass4()
    // inner function call using object
    println(inner.nestfunc()+" property accessed successfully from inner class ")
}
