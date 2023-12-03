import java.util.Scanner

fun main(args: Array<String>) {
    var scan = Scanner(System.`in`)
    var N = scan.nextInt()

    var hour = N / 3600
    var min = (N / 60) - (hour * 60)
    var sec = N % 60

    println("$hour:$min:$sec")
}