package com.example.testing

//base class
open class Employee5 {
    constructor(name: String,age: Int){
        println("Name of the Employee is $name")
        println("Age of the Employee is $age")
    }
}
// derived class
class CEO5 : Employee5{
    constructor( name: String,age: Int, salary: Double): super(name,age) {
        println("Salary per annum is $salary million dollars")
    }
}
fun main(args: Array<String>) {
    CEO5("Satya Nadela", 48, 250.00)
}
