package com.example.testing

// base class
open class A1 {
    open protected val int = 10 // protected variable

}
// derived class
class B1: A1() {
    override val int = 20
    fun getvalue():Int {
        return int		 // accessed from the subclass
    }
}
fun main(args: Array<String>) {
    var a = B1()
    println("The overridden value of integer is: "+a.getvalue())
}
