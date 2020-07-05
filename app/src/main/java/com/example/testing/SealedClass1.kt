package com.example.testing

sealed class Demo {
    class A : Demo() {
        fun display()
        {
            println("Subclass A of sealed class Demo")
        }
    }
    class B : Demo() {
        fun display()
        {
            println("Subclass B of sealed class Demo")
        }
    }
}
fun main()
{
    val obj = Demo.B()
    obj.display()

    val obj1 = Demo.A()
    obj1.display()
}
