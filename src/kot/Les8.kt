package kot

/**
 * Loop for
 */
fun main() {
//    val arr = IntArray(100,  ::nextElem)
    val arr = IntArray(100) { previousElem -> previousElem + 1 }

//    for (i in arr.indices)
//    arr.forEach { e -> println(e) }
//    for (elem in arr)  println(elem)

}

fun nextElem(previousElem: Int): Int = previousElem + 1