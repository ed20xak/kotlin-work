// Task 4.7: finding the longest line in a file

import kotlin.system.exitProcess
import kotlin.io.path.*

fun main(args: Array<String>) {
    if (args.size != 1) {
        println("Error: File name required on the command line")
        exitProcess(1)
    }

    val filePath = Path(args[0])

    var longestLen = 0
    var longestLine = 1
    var i = 1

    filePath.forEachLine {
        if (it.length > longestLen) {
            longestLen = it.length
            longestLine = i
        }
        i++
    }

    println("Line %d is the longest (length = %d)".format(longestLine, longestLen))
}