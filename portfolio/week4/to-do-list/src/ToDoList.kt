// COMP2850 Portfolio: Week 4
// ToDoList class

import kotlinx.datetime.LocalDate
import kotlin.io.path.Path
import kotlin.io.path.forEachLine
import kotlin.io.path.writer
import ItemStatus.*

class ToDoList() {
    private val items = mutableListOf<ToDoItem>()

    val size get() = items.size
    val notStarted get() = items.count { it.status == NotStarted }   // compute no. of items with NotStarted status
    val inProgress get() = items.count { it.status == InProgress }   // compute no. of items with InProgress status
    val done get() = items.count { it.status == Done }         // compute no. of items with Done status
    val overdue get() = items.count { it.isOverdue() == true }      // compute no. of overdue items

    constructor(filename: String): this() {
        load(filename)
    }

    fun load(filename: String) {
        // Implement code to read To Do list from a file here
        // See data/to-do.csv for an example of the format
        Path(filename).forEachLine {
            val parts = it.split(": ")
            items.add(ToDoItem(LocalDate.parse(parts[0]), ItemStatus.valueOf(parts[1]), parts[2]))
        }
    }

    fun save(filename: String) {
        Path(filename).writer().use {
            for (item in items) {
                it.write("$item\n")
            }
        }
    }

    fun add(vararg item: ToDoItem) = item.forEach { items.add(it) }

    fun deleteDone(): Boolean {
        // Write code here to remove items with status of Done
        // Return true if any were removed, false if none were removed
        if (items.removeAll { it.status == Done }) return true

        return false
    }

    fun getItems(status: ItemStatus? = null): List<ToDoItem> {
        // Write code here to return a list of items with the matching
        // status, or a list of all items if status argument is null
        if (status != null) return items.filter { it.status == status }

        return items
    }

    fun getItemsDueOn(date: LocalDate): List<ToDoItem> {
        // Write code here to return a list of items
        // that are due on the specified date
        return items.filter { it.dueDate == date }
    }
}
