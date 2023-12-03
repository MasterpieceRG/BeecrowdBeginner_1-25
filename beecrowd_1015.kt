import java.util.Scanner
import kotlin.math.sqrt

fun main(args: Array<String>) {
    var scan = Scanner(System.`in`)
    var x1 = scan.nextDouble()
    var y1 = scan.nextDouble()
    var x2 = scan.nextDouble()
    var y2 = scan.nextDouble()

    var distance = sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2))
    println("${"%.4f".format(distance)}")
}