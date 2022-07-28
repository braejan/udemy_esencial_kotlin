package controlstructures

import kotlin.random.Random


fun main() {
    //if else
    var loggedIn: Boolean = false
    val hasAddress: Boolean = true

    if (loggedIn) {
        println("You are logged in")
    } else {
        if (hasAddress) {
            print("Do you wanna login? [y (yes)/ n (no)]: ")
            val response: String = readln()
            when (response) {
                "y" -> loggedIn = true
                else -> println("Not logged in")
            }
        }
    }
    printStatistics(loggedIn)
    printStatistics(hasAddress)

    when (val generated: Int = Random.nextInt(1, 100)) {
        in 1..10 -> println("Very Low probability $generated%")
        in 10..30 -> println("Low probability $generated%")
        in 30..60 -> println("Medium probability $generated%")
        in 60..70 -> println("Good probability $generated%")
        in 70..100 -> println("Very good probability $generated%")
    }
}

fun printStatistics(item: Boolean) {
    when(item) {
        true -> "This item is true"
        false -> "This item is false"
    }
}
