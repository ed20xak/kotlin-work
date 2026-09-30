// Task 3.5: simple file I/O

import kotlin.io.path.Path
import kotlin.io.path.appendText
import kotlin.io.path.readText
import kotlin.io.path.writeText

fun main() {
    // Add your code here
    val filePath = Path("test.txt")
    filePath.writeText("The Sin Archbishop of the Witch's Cult Representing Greed\n")
    filePath.appendText("Regulus Corneas")

    val fileContents = filePath.readText()
    println(fileContents)
}
