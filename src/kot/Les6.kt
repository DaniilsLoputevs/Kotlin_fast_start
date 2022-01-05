package kot

/**
 *operator when
 */
fun main() {
    val time = 3
    val isWeather = true
    val rsl = when {
        time in 6..22 && isWeather -> "walk in park"
        time in 6..22 && !isWeather -> "read book"
        else -> "go to bed"
    }
    println(rsl)

}