// Task 4.4: temperature conversion using a while loop

import kotlin.system.exitProcess

import com.github.ajalt.mordant.rendering.AnsiLevel
import com.github.ajalt.mordant.rendering.TextAlign
import com.github.ajalt.mordant.rendering.TextColors.*
import com.github.ajalt.mordant.rendering.TextColors.Companion.rgb
import com.github.ajalt.mordant.rendering.TextStyles.*
import com.github.ajalt.mordant.table.table
import com.github.ajalt.mordant.table.Borders
import com.github.ajalt.mordant.table.ColumnWidth
import com.github.ajalt.mordant.terminal.Terminal

fun main(args: Array<String>) {
    // Add your code here
    if (args.size != 3) {
        println("Error: Exactly three values are required on the command line")
        exitProcess(1)
    }

    val initTemp = args[0].toDouble()
    val maxTemp = args[1].toDouble()
    val incrTemp = args[2].toDouble()

    var c = initTemp
    var f = 0.0
    var i = 1

    val t = Terminal()
    t.println(table {
        align = TextAlign.RIGHT
        cellBorders = Borders.NONE
        column(0) { width = ColumnWidth.Fixed(15) }
        column(1) { width = ColumnWidth.Fixed(15) }

        header {
            column(0) {
                style = white + rgb("#C62828").bg + bold
            }
            column(1) {
                style = white + rgb("#1565C0").bg + bold
            }
            row("\nCELSIUS (°C)\n", "\nFAHRENHEIT (°F)\n")
            }

        body {
            while (c <= maxTemp) {
                f = ((c * 9/5) + 32)
                //row("\n%.1f\n".format(c), "\n%.1f\n".format(f))
                row {
                    cell("\n%.1f\n".format(c)) {
                        style = if (i % 2 == 0) black + rgb("#EF9A9A").bg else black + rgb("#E57373").bg
                    }
                    cell("\n%.1f\n".format(f)) {
                        style = if (i % 2 == 0) black + rgb("#90CAF9").bg else black + rgb("#64B5F6").bg
                    }
                }
                c += incrTemp
                i++
            }
        }
    })
}
