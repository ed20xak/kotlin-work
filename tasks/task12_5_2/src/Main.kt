// Task 12.5.2: demo program for class with custom getter
import kotlinx.datetime.LocalDate

fun main() {
    val person = Person("RegULus coRNeas", LocalDate(2003, 9, 23))
    println("This person's name is ${person.name}")
}