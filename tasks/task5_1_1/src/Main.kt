// Task 5.1.1: main program
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 2) {
        println("Error: Exactly two words required on the command line")
        exitProcess(1)
    }

    if (anagrams(args[0], args[1])) {
        println("Your words are anagrams of each other.")
    }
    else {
        println("Your words are NOT anagrams of each other")
    }
}