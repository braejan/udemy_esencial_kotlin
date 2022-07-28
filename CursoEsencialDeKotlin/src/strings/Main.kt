package strings

fun main() {
    println("Welcome to String practice for Kotlin")

    //String template:
    print("What's your name? ")
    val name = readln()
    val greeting = "Hello $name"

    println(greeting)

    val price = 5.25
    val tax = 0.08

    val total = price.plus(price.times(tax))

    println("Final price after tax: $total \$ADA")

    val unicode = 0x2764

    val emojiLove = unicode.toChar().toString()

    println("I $emojiLove learn new Kotlin tips")
}
