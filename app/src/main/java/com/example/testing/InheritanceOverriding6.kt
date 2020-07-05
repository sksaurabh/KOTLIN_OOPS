package com.example.testing

// base class
open class Animal {
    open fun run() {
        println("Animals can run")
    }
}
// derived class
class Tiger: Animal() {
    override fun run() {	 // overrides the run method of base class
        println("Tiger can run very fast")
    }
}
fun main(args: Array<String>) {
    val t = Tiger()
    t.run()
}
