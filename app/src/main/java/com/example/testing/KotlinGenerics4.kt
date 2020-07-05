package com.example.testing

/*fun main(args: Array<String>) {
    var a: Container<Dog> = Container<Animal2>() //compiles without error
    //var b: Container<Animal> = Container<Dog>() //gives compilation error
}
open class Animal2
class Dog : Animal2()
class Container<in T>*/
// star projection in array
fun printArray(array: Array<*>) {
    array.forEach { print(it) }
}
fun main(args :Array<String>) {
    val name = arrayOf("aa","for","aa")
    printArray(name)
}
