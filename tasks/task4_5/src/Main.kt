// Task 4.5: summing odd integers with a for loop

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    // Add your code here
    if (args.size != 1) {
        println("Error: Exactly one number required on the command line")
        exitProcess(1)
    }

    val uppLim = args[0].toULong()
    var sum: ULong = 0uL

    for (n in 1uL..uppLim step 2) {
        sum += n
    }

    println("The sum total of odd numbers between 1 and %s is: %s".format(uppLim, sum))
}
