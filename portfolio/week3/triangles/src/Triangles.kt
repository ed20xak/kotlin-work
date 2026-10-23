// COMP2850 Portfolio: Week 3
// Functions for working with triangle geometry

import kotlin.math.sqrt

typealias Triangle = Triple<Double,Double,Double>

// Add isValidTriangle() and triangleArea() functions here
fun isValidTriangle(triangle: Triangle): Boolean {
    // Use destructuring to asign the sides to variables
    val (a, b, c) = triangle
    // Return true if every side is smaller than the sum of the other two sides
    if (a < (b + c) && b < (a + c) && c < (a + b)) {
        return true
    }
    return false
}

fun triangleArea(triangle: Triangle): Double {
    // Test if triangle is valid
    require(isValidTriangle(triangle)) { "Triangle is not valid" }
    
    // Use destructuring to asign the sides to variables
    val (a, b, c) = triangle

    // Calculate the area using Heron's Formula
    val s = 0.5*(a + b + c)
    val area = sqrt(s*(s-a)*(s-b)*(s-c))

    return area
}