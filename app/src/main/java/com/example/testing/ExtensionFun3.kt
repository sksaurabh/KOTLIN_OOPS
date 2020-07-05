package com.example.testing

// Open class created to be inherited
open class AV(val a:Int, val b:Int){
}

// Class B inherits A
class BV():AV(5, 5){}

fun main(){

    // Extension function operate defined for A
    fun AV.operate():Int{
        return a+b
    }

    // Extension function operate defined for B
    fun BV.operate():Int{
        return a*b;
    }

    // Function to display static dispatch
    fun display(a: AV){
        print(a.operate())
    }

    // Calling display function
    display(BV())
}
