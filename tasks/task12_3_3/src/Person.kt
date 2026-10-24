// Task 12.3.3: Person class with secondary constructor
import kotlinx.datetime.LocalDate

class Person(var name: String, val birth: LocalDate) {
    constructor(name: String, birth: String): this(name, LocalDate.parse(birth))

    var isMarried = false

    init {
        require(name.isNotBlank()) { "Name cannot be blank" }
    }
}