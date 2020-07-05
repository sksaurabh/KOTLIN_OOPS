package com.example.testing

/*
fun main(args: Array<String>) {
    val x: MyClass3<Any> = MyClass3<Int>()	 // Error: Type mismatch
    val y: MyClass3<out Any> = MyClass3<String>() // Works since String is a subtype of Any
    val z: MyClass3<out String> = MyClass3<Any>() // Error since Any is a supertype of String
}
class MyClass3<T>
*/
fun main(args: Array<String>) {
    val y: MyClass3<Any> = MyClass3<String>() // Compiles without error
}
class MyClass3<out T>
