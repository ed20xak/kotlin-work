// Task 12.4.1: main program

fun main() {
    val c = Circle(Point(4.0, 4.0), 4.0)

    println("Circle c area = %.2f".format(c.area()))
    println("Circle c perimeter = %.2f".format(c.perimeter()))

    val p = Point(6.82, 6.83)
    
    if (c contains p) {
        println("Point (${p.x}, ${p.y}) is in circle c")
    }
    else {
        println("Point (${p.x}, ${p.y}) is not in circle c")
    }
}