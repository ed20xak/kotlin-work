// Task 12.3.2: demo of Person class with secondary constructor
import kotlinx.datetime.LocalDate

fun main() {
    val date = LocalDate(2003, 9, 23)
    val dateStr = "2003-09-23"
    
    val person = Person("Regulus Corneas", dateStr).apply {
        isMarried = true
    }

    println("This person's name is ${person.name} and their birth date is ${person.birth}")
    if (person.isMarried == true) {
        println("${person.name} is married")
    }
    else {
        println("${person.name} is not married")
    }
}