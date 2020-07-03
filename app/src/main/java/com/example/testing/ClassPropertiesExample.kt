package com.example.testing

class Abc(
    val name: String,
    val ispassed : Boolean
)

fun main(args: Array<String>) {

    val abc = Abc("Bob",true)
    println(abc.name)
    println(abc.ispassed)

    /*
    In Java
    Abc abc = new Abc("Bob",true);
    System.out.println(person.getName());
    System.out.println(person.isMarried());

    */
}
