package com.example.testing

fun copy(from: Array<out Any>, to: Array<Any>) {
    assert(from.size == to.size)
    // copying (from) array to (to) array
    for (i in from.indices)
        to[i] = from[i]
    // printing elements of array in which copied
    for (i in to.indices) {
        println(to[i])
    }
}
fun main(args :Array<String>) {
    val ints: Array<Int> = arrayOf(1, 2, 3)
    val any :Array<Any> = Array<Any>(3) { "" }
    copy(ints, any)

}
