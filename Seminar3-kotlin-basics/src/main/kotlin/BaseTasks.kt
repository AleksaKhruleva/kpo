import kotlin.math.sqrt

fun askForInput() {
    val surname = readln()
    val name = readln()
    val lastName = readln()

    println(
        """
        Фамилия:  ${surname}
        Имя:      ${name}
        Отчество: ${lastName}
        """.trimIndent())
}

fun quadraticRoots(a: Double, b: Double, c: Double): Pair<Double, Double> {
    val d = b * b - 4 * a * c
    val x1 = (-b + sqrt(d)) / (2 * a)
    val x2 = (-b - sqrt(d)) / (2 * a)

    return x1 to x2
}

fun printSameDigitNumbers() {
    for (i in 1..9) {
        println("${i}${i}${i}")
    }
}

fun main() {
    askForInput()

    val roots = quadraticRoots(-5.0, 4.0, 3.0)
    println("X1 = ${roots.first} ; X2 = ${roots.second}")

    printSameDigitNumbers()
}