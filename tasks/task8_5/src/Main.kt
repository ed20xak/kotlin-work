// Task 8.5: example of using a higher-order function

fun main() {
    // Add your testing code here
    val text = "Sin Archbishop of the Witch's Cult Representing Greed, Regulus Corneas"

    //println(text.howMany )
    println(text.howMany { it.lowercase() in "aeiou" }) // Number of vowels
    println(text.howMany { it.isLetter() }) // Number of letters
    println(text.howMany { !it.isLetterOrDigit() && !it.isWhitespace() }) // Number of miscellaneous characters
    println(text.howMany { it.isUpperCase() && !(it in "AEIOU") }) // Number of upper case consonants
    println()
    println(text.count { it.lowercase() in "aeiou" }) // Number of vowels
    println(text.count { it.isLetter() }) // Number of letters
    println(text.count { !it.isLetterOrDigit() && !it.isWhitespace() }) // Number of miscellaneous characters
    println(text.count { it.isUpperCase() && !(it in "AEIOU") }) // Number of upper case consonants
}
