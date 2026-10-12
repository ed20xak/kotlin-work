// Task 7.3.1: list element access

fun main() {
    val numbers = listOf(9, 3, 6, 2, 8, 5)
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

    // 5. Changes the first element to 7 xxx Generates an error requiring a 'set' operator method to provide array access
    // numbers[0] = 7

    // 6. Appends the element 1 to the list xxx Generates an unresolved reference to 'add' error
    numbers.add(1)
}