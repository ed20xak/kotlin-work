// Task 9.6: application to compute dataset variance

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    // Implement main program here
    val result = runCatching {
        require(args.size == 1) {"Error: File name missing"}

        val dataset = readData(args[0])
        val variance = variance(dataset)
        println("Dataset size = %d\nVariance = %.5f".format(dataset.size, variance))
    }

    if (result.isFailure) {
        println("Task failed with an exception")
        println(result.exceptionOrNull())
    }
}
