// Task 12.8.1: demo program for Day enum class

fun main() {
    try {
        for (d in Day.entries) {
            if (d == Day.entries.last()) {
                print("$d")
            }
            else {
                print("$d, ")
            }
        }
        print("\nPlease enter a day of the week matching the format of the above examples: ")
        val day = Day.valueOf(readln())
    }
    catch (error: IllegalArgumentException) {
        println("\nIllegal argument")
        println("Invalid day entered (format may not match the above examples)")
    }
}