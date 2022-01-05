package kot

/**
 * Nullable types
 */
fun main() {
    val a : String? = null
    val b : String? = "1234567"
    val c : String? = ""

    val rsl : Int =  (a?.length ?: 0) + (b?.length ?: 0) + (c?.length ?: 0)
    println(rsl)
}