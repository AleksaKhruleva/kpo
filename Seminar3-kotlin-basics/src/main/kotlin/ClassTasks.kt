import kotlin.math.PI

open class Point(val X: Double, val Y: Double) {

    private val area: Double = 0.0

    open fun display() {
        println("S = ${"%.2f".format(area).padStart(6, ' ')}, X = $X, Y = $Y")
    }
}

class Circle(X: Double, Y: Double, val R: Double): Point(X, Y) {

    private val area: Double = PI * R * R

    override fun display() {
        println("S = ${"%.2f".format(area).padStart(6, ' ')}, X = $X, Y = $Y, Radius = $R")
    }
}

class Square(X: Double, Y: Double, val S: Double): Point(X, Y) {

    private val area: Double = S * S

    override fun display() {
        println("S = ${"%.2f".format(area).padStart(6, ' ')}, X = $X, Y = $Y, Side = $S")
    }
}

fun main() {
    val p = Point(34.0, 56.0)
    val c = Circle(46.0, 34.0, 7.0)
    val s = Square(46.0, 34.0, 8.0)
    print("Point : ")
    p.display()
    print("Circle: ")
    c.display()
    print("Square: ")
    s.display()
}