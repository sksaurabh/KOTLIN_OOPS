package com.example.testing

//base class
open class EmployeeConst4(name: String,age: Int) {
    init{
        println("Name of the Employee is $name")
        println("Age of the Employee is $age")
    }
}
// derived class
class CEO4( name: String, age: Int, salary: Double): EmployeeConst4(name,age) {
    init {
        println("Salary per annum is $salary crore rupees")
    }
}
fun main(args: Array<String>) {
    CEO4("Sunder Pichai", 42, 450.00)
}
