package com.example.testing

class CompanyOne (text: String) {
    var x = text
    init{
        println(x)
    }
}
fun main(args: Array<String>){
    var name: CompanyOne = CompanyOne("abc")
   // var rank: CompanyOne = CompanyOne(12)// compile time error
}
