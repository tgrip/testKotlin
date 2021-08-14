import java.util.*
import kotlin.math.sqrt

fun main() {
    val scanner = Scanner(System.`in`)
    if (scanner.hasNextLine()) {
        when (scanner.nextLine()) {
            "rectangle" -> printRectangleArea(scanner)
            "circle" -> printCircleArea(scanner)
            "triangle" -> printTriangleArea(scanner)
        }

    }
}

fun printTriangleArea(scanner: Scanner) {
    var a = 0.0
    if (scanner.hasNextDouble()) {
        a = scanner.nextDouble()
    }
    var b = 0.0
    if (scanner.hasNextDouble()) {
        b = scanner.nextDouble()
    }
    var c = 0.0
    if (scanner.hasNextDouble()) {
        c = scanner.nextDouble()
    }
    val s = (a + b + c) / 2
    val area = sqrt(s * (s - a) * (s - b) * (s - c))
    println(area)
}

fun printCircleArea(scanner: Scanner) {
    val pi = 3.14
    if (scanner.hasNextInt()) {
        val r = scanner.nextInt()
        println(pi * r * r)
    }
}

fun printRectangleArea(scanner: Scanner) {
    var x = 1.0
    if (scanner.hasNextDouble()) {
        x = scanner.nextDouble()
    }
    if (scanner.hasNextDouble()) {
        println(x * scanner.nextDouble())
    }
}
