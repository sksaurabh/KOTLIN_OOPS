package com.example.testing

// base class
// base class
open class Animal7 {
    open var name: String = "Dog"
    open var speed = "40 km/hr"

}
// derived class
class Tiger7: Animal7() {
    override var name = "Tiger"
    override var speed = "100 km/hr"
}
fun main(args: Array<String>) {
    val t = Tiger7()
    println(t.name+" can run at speed "+t.speed)
}

