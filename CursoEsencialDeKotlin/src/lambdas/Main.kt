package lambdas

fun main() {

    val printHello = {
        println("Hello from lambda")
    }
    printHello()

    val printText = { text: String ->
        println("***** $text")
    }

    printText("Braejan Arias")

    val plus: (Int, Int) -> Int = {x, y ->
        val result = x.plus(y)
        println("$x + $y = $result")
        result
    }

    val total = plus(10, 15)
    println("total: $total")
}
