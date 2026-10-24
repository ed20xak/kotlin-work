// Task 12.1: program that uses a Point object

fun main() {
    val p1 = Point(8.0, 15.0)

    println("Point 1: (${p1.x}, ${p1.y})")
    println("Point 1 distance from origin: %.1f\n".format(p1.distance()))

    val p2 = Point(4.5, 7.0)

    println("Point 2: (${p2.x}, ${p2.y})")
    println("Point 1 distance from Point 2: %.1f".format(p1.distanceTo(p2)))
}