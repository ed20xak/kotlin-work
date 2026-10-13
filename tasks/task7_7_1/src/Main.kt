// Task 7.7.1: program to compute stats for a numeric dataset
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 1) {
        println("Error: Exactly one file name required on the command line")
        exitProcess(1)
    }

    statistics(readData(args[0]))
}