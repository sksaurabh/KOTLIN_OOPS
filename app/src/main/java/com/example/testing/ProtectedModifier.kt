package com.example.testing

// base class
open class A {
    protected val int = 10 // protected variable
}
// derived class
class B: A() {
    fun getvalue(): Int {
        return int		 // accessed from the subclass
    }
}
fun main(args: Array<String>) {
    var a = B()
    println("The value of integer is: "+a.getvalue())
}
