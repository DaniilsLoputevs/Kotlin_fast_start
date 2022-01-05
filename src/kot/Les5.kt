package kot

/**
 * operator if
 */
fun main() {
    val money = 550
    val eat = if (money >= 500) "Pizza"
    else if (money >= 200) "shaurma"
    else "Doshirak"
    println("You can buy $eat")
}