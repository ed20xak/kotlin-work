// Task 12.5.4: class with a computed property

import kotlinx.datetime.LocalDate
import kotlinx.datetime.yearsUntil

class Person(var name: String, val birth: LocalDate) {
    var isMarried = true
    val age get() = birth.yearsUntil(today())
}
