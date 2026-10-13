// Task 7.7.1: statistics functions

fun List<Float>.median(): Float {
    val n = this.size
    val numbers = this.sorted()

    if (n % 2 == 0) {
        return ((numbers[(n / 2) - 1]) + (numbers[n/2])) / 2
    }
    else {
        return numbers[(n - 1) / 2]
    }
}

fun statistics(numbers: List<Float>) = println(
    "Minimum Value = %.2f\nMaximum Value = %.2f\nMean = %.2f\nMedian = %.2f".format(numbers.min(), numbers.max(), numbers.average(), numbers.median())
)