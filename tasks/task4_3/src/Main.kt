// Task 4.3: grade calculation using a when expression
import kotlin.system.exitProcess
import kotlin.math.roundToInt

fun main(args: Array<String>) {
    if (args.size != 3) {
        println("Error: Exactly three marks required on the command line")
        exitProcess(1)
    }

    val avgMark = ((args[0].toInt() + args[1].toInt() + args[2].toInt())/3.0).roundToInt()

    val grade =
    when (avgMark) {
        in 0..39   -> "Fail"
        in 40..69  -> "Pass"
        in 70..100 -> "Distinction"
        else       -> "?"
    }

    println("Your Average Mark is: %d\nYour Grade is: %s".format(avgMark, grade))
}