// Task 12.5.4: demo program for class with a computed property
import kotlinx.datetime.LocalDate

fun main() {
    val person = Person("Regulus Corneas", LocalDate(2003, 9, 23))
    println("This person is ${person.age} years old")
}