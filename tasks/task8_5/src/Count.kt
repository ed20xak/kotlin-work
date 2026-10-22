// Task 8.5: example of a higher-order function

fun String.howMany(include: (Char) -> Boolean): Int {
    var count = 0
    for (character in this) {
        if (include(character)) {
            count += 1
        }
    }
    
    return count
}