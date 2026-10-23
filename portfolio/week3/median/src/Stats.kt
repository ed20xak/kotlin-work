// COMP2850 Portfolio: Week 3

fun median(numList: List<Float>): Float {
    require(numList.size > 0) {}

    val n = numList.size
    val numbers = numList.sorted()

    if (n % 2 == 0) {
        return ((numbers[(n / 2) - 1]) + (numbers[n/2])) / 2
    }
    else {
        return numbers[(n - 1) / 2]
    }
}