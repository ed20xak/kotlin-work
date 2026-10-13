// Task 7.7.2: phone book simulator

const val CSV_FILENAME = "phone.csv"

fun search(database: Database) {
    print("Enter a name to search for or add: ")
    val name = readln()

    if (name.isEmpty()) {
        println("No input recognised")
    }
    else if (name.lowercase() in database.keys) {
        println(database[name.lowercase()])
    }
    else {
        print("Please enter this person's phone number: ")
        val number = readln()
        if (number.all { it.isDigit() }) {
            database[name.lowercase()] = number
            database.save(CSV_FILENAME)
        }
        else {
            println("Not a valid number")
        }
    }
}

fun main() {
    // Implement the main program here
    // (You can add other functions to this file if you wish)

    val database = createDatabase()
    database.load(CSV_FILENAME)

    var stop = false

    while (stop == false) {
        search(database)

        print("\nContinue? Y/N  ")
        if (readln().uppercase() == "N") {
            stop = true
        }
        else {
            println()
        }
    }
}
