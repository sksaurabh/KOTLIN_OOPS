package com.example.testing

enum class DAYS4{
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;
}

fun main(){
    when(DAYS4.SUNDAY){
        DAYS4.SUNDAY -> println("Today is Sunday")
        DAYS4.MONDAY -> println("Today is Monday")
        DAYS4.TUESDAY -> println("Today is Tuesday")
        DAYS4.WEDNESDAY -> println("Today is Wednesday")
        DAYS4.THURSDAY -> println("Today is Thursday")
        DAYS4.FRIDAY -> println("Today is Friday")
        DAYS4.SATURDAY -> println("Today is Saturday")
        // Adding an else clause will generate a warning
    }
}
