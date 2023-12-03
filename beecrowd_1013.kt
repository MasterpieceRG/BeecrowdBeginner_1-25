import java.util.Scanner
import kotlin.math.abs

fun main(args: Array<String>) {
    var scan = Scanner(System.`in`)
    var a = scan.nextInt()
    var b = scan.nextInt()
    var c = scan.nextInt()

    var MaiorAB = (a + b + abs(a-b))/2
    var MaiorABC = (MaiorAB + c + abs(MaiorAB-c))/2

    println("${MaiorABC} eh o maior")
}