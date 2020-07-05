package com.example.testing

class Company2<T> (text : T){
    var x = text
    init{
        println(x)
    }
}
fun main(args: Array<String>){
    var name: Company2<String> = Company2<String>("abc")
    var rank: Company2<Int> = Company2<Int>(12)
}
