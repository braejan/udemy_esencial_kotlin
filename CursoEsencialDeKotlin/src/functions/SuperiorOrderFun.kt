package functions

import kotlin.random.Random

fun main() {
    val validation = when(Random.nextInt(1, 4)) {
        1 -> {x:Int, y: Int -> x.plus(y)}
        2 -> {x:Int, y: Int -> x.minus(y)}
        3 -> {x:Int, y: Int -> x.times(y)}
        else -> {x:Int, y: Int -> x.div(y)}
    }
    val x = Random.nextInt(1, 1000)
    val y = Random.nextInt(1, 1000)
    executeOperation(x, y, validation)
}


fun executeOperation(x: Int, y: Int, operation: (x:Int, y:Int) -> Int) {
    println("Executing operation for $x and $y")
    val result = operation(x, y)
    println("result: $result")
}

