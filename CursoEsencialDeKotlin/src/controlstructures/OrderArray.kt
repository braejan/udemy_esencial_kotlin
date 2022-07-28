package controlstructures

fun main() {
    val repeated = intArrayOf(0, 0, 0, 1, 1, 1, 1, 1, 2, 3, 3, 3, 4, 5, 5, 5, 5, 6, 7, 8, 9)
    val clean = IntArray(repeated.size)
    var current = repeated[0].minus(1)
    var index = 0
    for (item in repeated) {
        if (item > current){
            current = item
            clean[index] = item
            index = index.plus(1)
        }
    }
    println(clean.toList())
}
