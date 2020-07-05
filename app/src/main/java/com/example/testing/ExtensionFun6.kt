package com.example.testing

class MyClass6 {
    companion object {
        // member function of companion object
        fun display(str :String) : String{
            return str
        }
    }
}
// extension function of companion object
fun MyClass6.Companion.abc(){
    println("Extension function of companion object")
}
fun main(args: Array<String>) {
    val ob = MyClass6.display("Function declared in companion object")
    println(ob)
    // invoking the extension function
    val ob2 = MyClass6.abc()
}
