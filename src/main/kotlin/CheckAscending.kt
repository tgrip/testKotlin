import java.util.*

fun main(){
    val scanner= Scanner(System.`in`)
    if (scanner.hasNextInt()) {
        val times = scanner.nextInt()
        var ascending = true
        var lastNumber = -1
        repeat(times) {
            val number = scanner.nextInt()
            ascending = ascending && lastNumber < number
            lastNumber = number
        }
        val msg = if (ascending) "YES" else "NO"
        println(msg)
    }
}