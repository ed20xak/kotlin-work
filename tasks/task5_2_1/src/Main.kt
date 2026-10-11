// Task 5.2.1: main program
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 1) {
        println("Error: Exactly one radius required on the command line")
        exitProcess(1)
    }

    val r = args[0].toDouble()

    println("The area is: %.4f\nThe perimeter is: %.4f".format(circleArea(r), circlePerimeter(r)))
}