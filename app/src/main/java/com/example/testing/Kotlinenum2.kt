package com.example.testing

// A property with default value provided
enum class DAYS1(val isWeekend: Boolean = false){
    SUNDAY(true),
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    // Default value overridden
    SATURDAY(true);

    companion object{
        fun today(obj: DAYS1): Boolean {
            return obj.name.compareTo("SATURDAY") == 0 || obj.name.compareTo("SUNDAY") == 0
        }
    }
}

fun main(){1
    // A simple demonstration of properties and methods
    for(day in DAYS1.values()) {
        println("${day.ordinal} = ${day.name} and is weekend ${day.isWeekend}")
    }
    val today = DAYS1.MONDAY;
    println("Is today a weekend ${DAYS1.today(today)}")
}
