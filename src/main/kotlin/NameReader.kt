fun main() {
    val scanner = java.util.Scanner(System.`in`)
    // put your code here#
    var abbreviatedName = ""
    if (scanner.hasNextLine()) {
        val firstName = scanner.nextLine()
        abbreviatedName = firstName[0] + "."
    }

    if (scanner.hasNextLine()) {
        println("$abbreviatedName ${scanner.nextLine()}")
    }


}