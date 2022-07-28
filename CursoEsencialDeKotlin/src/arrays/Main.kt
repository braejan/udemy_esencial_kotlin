package arrays

fun main() {
    println("Welcome to Kotlin arrays practice")
    val colors = arrayOf("Red", "Blue", "Green")

    colors.forEach {
        println(">> $it")
    }

    val personalData = arrayOf("Braejan", "Arias", 32, "https://github.com/braejan")

    personalData.forEach {
        println(it)
    }

    //Empty
    val emptyArray = emptyArray<String>()

}
