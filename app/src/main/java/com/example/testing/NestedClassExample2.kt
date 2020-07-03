package com.example.testing

//outer class declaration
class outerClass2 {
    var str = "Outer class"
    // nested class declaration
    class nestedClass2 {
        var s1 = "Nested class"
        // nested class member function
        fun nestfunc(str2: String): String {
            var s2 = s1.plus(str2)
            return s2
        }
    }
}
fun main(args: Array<String>) {

    // creating object of Nested class
    val nested = outerClass2.nestedClass2()
    // invoking the nested member function by passing string
    var result = nested.nestfunc(" member function call successful")
    println(result)
}
