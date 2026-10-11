// Task 5.1.2: main program
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 1) {
        println("Error: Exactly one number is required on the command line")
        exitProcess(1)
    }

    rollDie(args[0].toInt())
}