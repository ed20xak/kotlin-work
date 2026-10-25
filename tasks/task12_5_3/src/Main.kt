// Task 12.5.3: demo program for class with custom setter
import kotlinx.datetime.LocalDate

fun main() {
    val person = Person("Regulus Corneas", LocalDate(2003, 9, 23))
    person.name = ""
    println("This person's new name is ${person.name}")
}