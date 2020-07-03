package com.example.testing

//base class
open class Employee4(name: String,age: Int) {
    init{
        println("Name of the Employee is $name")
        println("Age of the Employee is $age")
    }
}
// derived class
class CEO( name: String, age: Int, salary: Double): Employee4(name,age) {
    init {
        println("Salary per annum is $salary crore rupees")
    }
}
fun main(args: Array<String>) {
    CEO("Sunder Pichai", 42, 450.00)
}
