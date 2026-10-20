// Task 8.3: weather station temperature analysis program

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    // Add your code here
    if (args.size != 1) {
        println("Error: Exactly one file name required on the command line")
        exitProcess(1)
    }

    val temps = fetchData(args[0])

    val lowTemp = temps.minBy { it.second }
    val highTemp = temps.maxBy { it.second }
    val avgTemp = (temps.sumOf { it.second }) / temps.size

    println("${lowTemp.first} is the coldest with a temperature of ${lowTemp.second}")
    println("${highTemp.first} is the warmest with a temperature of ${highTemp.second}")
    println("The average temperature is %.2f".format(avgTemp))
}
