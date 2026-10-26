// Task 12.9: class implementing the Static Factory Method pattern

import kotlinx.datetime.LocalDate

class Person private constructor(val name: String, val birth: LocalDate) {
    companion object Factory {
        private val names = mutableSetOf<String>()

        fun create(name: String, birth: LocalDate): Person {
            require(name !in names) { "Name must be unique" }
            names.add(name)
            return Person(name, birth)
        }
    }
}
