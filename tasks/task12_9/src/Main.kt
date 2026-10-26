// Task 12.9: demo program for class implementing Static Factory Method
import kotlinx.datetime.LocalDate

fun main() {
    val person = Person.create("Regulus Corneas", LocalDate(2003, 9, 23))
    println("This person's name is ${person.name}")
    
    val person2 = Person.create("Regulus Corneas", LocalDate(2002, 9, 23))
}