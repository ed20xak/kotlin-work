// COMP2850 Portfolio: Week 4
// Triangle class

import kotlin.math.sqrt

// Triangle Class with a primary constructor that initialises the three sides as val properties
class Triangle(val sideA: Double, val sideB: Double, val sideC: Double) {
    // Initialiser block that checks the values provided for the triangle's sides ensuring they are valid
    init {
        require(sideA < (sideB + sideC) && sideB < (sideA + sideC) && sideC < (sideA + sideB)) { "Invalid Triangle" }
    }

    // Computed properties for the perimeter, semi-perimeter and area
    val perimeter get() = sideA + sideB + sideC
    val semiPerimeter get() = perimeter / 2
    val area get() = sqrt(semiPerimeter*(semiPerimeter - sideA)*(semiPerimeter - sideB)*(semiPerimeter - sideC))

    // toString() override
    override fun toString() = "Triangle($sideA, $sideB, $sideC)"
}