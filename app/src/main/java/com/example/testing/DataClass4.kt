package com.example.testing

fun main(args: Array<String>)
{
    //declaring a data class
    data class man(val name: String, val age: Int)

    val man1 = man("manish",18)
    val man2 = man1.copy(name="rahul")
    val man3 = man1.copy();

    val hash1=man1.hashCode();
    val hash2=man2.hashCode();
    val hash3=man3.hashCode();

    println(hash1)
    println(hash2)
    println(hash3)

    //checking equality of these hash codes
    println("hash1 == hash 2 ${hash1.equals(hash2)}")
    println("hash2 == hash 3 ${hash2.equals(hash3)}")
    println("hash1 == hash 3 ${hash1.equals(hash3)}")

}
