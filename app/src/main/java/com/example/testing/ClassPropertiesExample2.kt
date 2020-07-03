package com.example.testing

class Rectangle1(val height: Int, val width: Int)
{
    val isSquare: Boolean
        get() {
            return height == width
        }
}

fun main(args: Array<String>) {

    val rectangle = Rectangle1(41, 43)
    println(rectangle.isSquare)
}
