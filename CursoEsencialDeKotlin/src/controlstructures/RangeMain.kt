package controlstructures

fun main() {
    val items = 1.rangeTo(3)
    items.forEach { println(it) }

    for (n in 1..10) {
        println(">>> $n")
    }

    for (item in items) {
        println("*** $item")
    }
}
