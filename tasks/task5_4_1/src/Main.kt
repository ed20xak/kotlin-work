// Task 5.4.1: main program
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size < 1) {
        println("Error: At least one string required on the command line")
        exitProcess(1)
    }

    for (n in 1..args.size) {
        if (args[n-1].isTooLong()) println("%s is too long".format(args[n-1])) else println("%s is NOT too long".format(args[n-1]))
    }
}