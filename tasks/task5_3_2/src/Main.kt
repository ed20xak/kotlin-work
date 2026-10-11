// Task 5.3.2: main program
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 1) {
        println("Error: Exactly one dice specification required on the command line")
        exitProcess(1)
    }

    val diceSpec = args[0].split("d")
    if (diceSpec.size != 2) {
        println("Error: Dice specification should ONLY contain the number of dice x and number of sides y in the form xdy")
        exitProcess(1)
    }
    rollDice(dice = diceSpec[0].toInt(), sides = diceSpec[1].toInt())
}