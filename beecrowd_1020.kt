import java.util.Scanner

fun main(args: Array<String>) {
    var scan = Scanner(System.`in`)
    var days = scan.nextInt()

    var year = days / 365
    var month = (days - (year * 365)) / 30
    var day = (days - (year * 365)) % 30

    println("$year ano(s)")
    println("$month mes(es)")
    println("$day dia(s)")
}