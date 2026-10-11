// Task 5.3.1: main program

fun main(args: Array<String>) {
    if (args.size != 1) {
        rollDie()
    }
    else {
        rollDie(args[0].toInt())
    }
}