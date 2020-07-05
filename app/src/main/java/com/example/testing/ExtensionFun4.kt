package com.example.testing

// A sample class to display name name
class AB(val name: String){
    override fun toString(): String {
        return "Name is $name"
    }
}

fun main(){
    // An extension function as a nullable receiver
    fun AB?.output(){
        if(this == null){
            println("Null")
        }else{
            println(this.toString())
        }
    }

    val x = AB("Charchit")

    // Extension function called using an instance
    x.output()
    // Extension function called on null
    null.output()
}
