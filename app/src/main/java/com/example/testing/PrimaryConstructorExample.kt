package com.example.testing

//main function
fun main(args: Array<String>)
{
    val add = Add1(5, 6)
    println("The Sum of numbers 5 and 6 is: ${add.c}")
}
//primary constructor
class Add1 constructor(a: Int,b:Int)
{
    var c = a+b;
}
