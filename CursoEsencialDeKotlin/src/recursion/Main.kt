package recursion

fun main() {

    val names: List<String> = arrayListOf("Bruce", "Arthur", "Kitty", "Honey")
    printList(names, names.size)
}


fun printList(list: List<String>, idx: Int) {
    println(list[idx.dec()])
    if (idx.dec() == 0) {
        return
    }
    printList(list, idx.dec())
}
