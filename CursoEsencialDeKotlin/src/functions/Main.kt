package functions


enum class PrintFormat {
    TITLE, BODY, FOOTER
}

fun main() {
    val title = "Welcome to functions Kotlin practice."
    val body = "This is a practice for learn new things about functions in Kotlin"
    val footer = "@braejandev - 2022"
    println(formatText(title, PrintFormat.TITLE))
    println(formatText(body, PrintFormat.BODY))
    println(formatText(footer, PrintFormat.FOOTER))
    println(getTwitterURL("@braejandev"))
    println(greet(name = "Braejan Arias"))
    println(greet())
}

fun formatText(text: String, format: PrintFormat): String {
    return when (format) {
        PrintFormat.TITLE -> "******* $text *******"
        PrintFormat.BODY -> ">> $text <<"
        PrintFormat.FOOTER -> "--------------  $text --------------"
        else -> ""
    }
}


fun getTwitterURL(username: String) : String {
    val cleanUserName = username.replace("@", "")
    return "https://twitter.com/$cleanUserName"
}

fun greet(name:String = "Bruce"): String = "Hello $name! It's nice to meet you!"
