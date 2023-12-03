import java.util.Scanner

fun main(args: Array<String>) {
    var scan = Scanner(System.`in`)
    var X = scan.nextInt()
    var Y = scan.nextDouble()

    var consumption = X / Y
    println("${"%.3f".format(consumption)} km/l")
}