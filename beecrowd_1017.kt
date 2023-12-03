import java.util.Scanner

fun main(args: Array<String>) {
    var scan = Scanner(System.`in`)
    var h = scan.nextDouble()
    var kmph = scan.nextDouble()

    var km = kmph * h
    var fuel = km / 12
    println("${"%.3f".format(fuel)}")
}