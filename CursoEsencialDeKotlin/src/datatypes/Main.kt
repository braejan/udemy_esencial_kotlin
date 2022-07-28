package datatypes

fun main() {
    println("Welcome to data types training.")
    //Byte
    val age: Byte = 20
    println("age: $age")

    //Int
    val salary: Int = 10_000_000
    println("salary: $salary")

    //Long
    val budget: Long = 123_456_789_987_654_321
    println("budget: $budget")

    //Double max 17
    val pi: Double = 3.141592654

    //Float max 7 not frequently used.
    val random: Float = 3.1234567F

    //Boolean
    val amILearning: Boolean = true
    val hasAddress = false

    if (amILearning) {
        println("Yeah! I'm currently learning.")
    }

    var result = amILearning and hasAddress
    println("result: $result")

    result = amILearning.and(hasAddress)
    println("result: $result")

    result = amILearning && hasAddress
    println("result: $result")

    println("not result: ${result.not()}")
    println("not result: ${!result}")

    result = amILearning or hasAddress
    println("result: $result")

    result = amILearning.or(hasAddress)
    println("result: $result")

    result = amILearning || hasAddress
    println("result: $result")

    val tab = '\t'
}
