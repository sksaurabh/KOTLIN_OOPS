package com.example.testing

class MyClass {
    // companion object declaration
    companion object {
        fun display(){
            println("Function declared in companion object")
        }
    }
}
fun main(args: Array<String>) {
// invoking member function
    val ob = MyClass.display()
}
