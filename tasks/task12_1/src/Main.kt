// Task 12.1: program that uses a Point object

fun main() {
    val p1 = Point(8.0, 15.0)

    println("Point 1 x: %.1f".format(p1.x))
    println("Point 1 y: %.1f".format(p1.y))
    println("Point 1 distance from origin: %.2f".format(p1.distance()))

    val p2 = Point(4.5, 7.0)

    println("Point 1 distance from Point 2: %.2f".format(p1.distanceTo(p2)))
}