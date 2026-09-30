// Task 3.1: command line arguments

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 2) {
        println("Error: Exactly two arguments are required")
        exitProcess(1)
    }

    println(args[0])
    println(args[1])
}