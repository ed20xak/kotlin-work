// Task 7.3.1: list element access

fun main() {
    val numbers = mutableListOf(9, 3, 6, 2, 8, 5)
    println(numbers)

    // 1. Prints 9
    println(numbers[0])

    // 2. Generates an ArrayIndexOutOfBoundsException
    // println(numbers[10])

    // 3. Print a list containing 6, 2 and 8
    println(numbers.slice(2..4))

    // 4. Prints 9 then prints 5
    println(numbers.first())
    println(numbers.last())

    // 5. Changes the first element to 7
    numbers[0] = 7
    println(numbers[0])

    // 6. Appends the element 1 to the list
    numbers.add(1)
    println(numbers.last())

    // addAll() = [7, 3, 6, 2, 8, 5, 1, 9, 2, 4, 10, 2]
    val numbers2 = listOf(9, 2, 4, 10, 2)
    numbers.addAll(numbers2)
    println(numbers)

    // remove() = [7, 3, 6, 8, 5, 1, 9, 2, 4, 10, 2]
    numbers.remove(2)
    println(numbers)

    // removeAll() = [7, 3, 6, 8, 5, 1, 9, 4]
    val numbers3 = listOf(2, 10)
    numbers.removeAll(numbers3)
    println(numbers)

    // removeAt() = [3, 6, 8, 5, 1, 9, 4]
    numbers.removeAt(0)
    println(numbers)

    // clear() = []
    numbers.clear()
    println(numbers)
}