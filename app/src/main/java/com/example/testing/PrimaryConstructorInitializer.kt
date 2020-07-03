package com.example.testing

fun main(args: Array<String>) {
    val emp = employees1(18018, "Sagnik")
}
class employees1(emp_id : Int , emp_name: String) {
    val id: Int
    var name: String

    // initializer block
    init {
        id = emp_id
        name = emp_name

        println("Employee id is: $id")
        println("Employee name: $name")
    }
}
