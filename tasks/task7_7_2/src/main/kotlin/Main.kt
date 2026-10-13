// Task 7.7.2: phone book simulator

const val CSV_FILENAME = "phone.csv"

fun main() {
    // Implement the main program here
    // (You can add other functions to this file if you wish)

    val database = createDatabase()
    database.load(CSV_FILENAME)

    var stop = false
    var name: String

    print("Enter a name to search for or add: ")
    name = readln()

    while (stop == false) {
        if (name.isEmpty()) {
            println("No input recognised")
        }
        else if (name in database.keys) {
            println(database[name])
        }
        else {
            print("Please enter this person's phone number ")
            database[name] = readln()
            database.save(CSV_FILENAME)
        }

        println("\nEnter STOP to exit")
        print("Enter a name to search for or add: ")
        name = readln()
        if (name == "STOP") {
            stop = true
        }
    }
}
