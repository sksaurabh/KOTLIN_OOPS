package com.example.testing

// outer class declaration
class outerClass3 {
    var str = "Outer class"
    // innerClass declaration without using inner keyword
    class innerClass3 {
        var s1 = "Inner class"
       /* fun nestfunc(): String {
            // can not access the outer class property str
            //var s2 = str
            return s2
        }
        */

    }
}
// main function
fun main(args: Array<String>) {
    // creating object for inner class
    val inner= outerClass3.innerClass3()
    // inner function call using object
   // println(inner.nestfunc())
}
