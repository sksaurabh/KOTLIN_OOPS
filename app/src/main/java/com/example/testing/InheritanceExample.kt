package com.example.testing

//base class
open class baseClass{
    val name = "GeeksforGeeks"
    fun A(){
        println("Base Class")
    }
}
//derived class
class derivedClass: baseClass() {
    fun B() {
        println(name)		 //inherit name property
        println("Derived class")
    }
}
fun main(args: Array<String>) {
    val derived = derivedClass()
    derived.A()		 // inherting the base class function
    derived.B()		 // calling derived class function
}
