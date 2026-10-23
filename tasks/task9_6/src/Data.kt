// Task 9.6: readData() function
import kotlin.io.path.Path
import kotlin.io.path.forEachLine

fun readData(filename: String) = buildList {
    Path(filename).forEachLine {
        if (it.toDoubleOrNull() == null) {
            throw NumberFormatException("Invalid number in file")
        }
        add(it.toDouble())
    }
}