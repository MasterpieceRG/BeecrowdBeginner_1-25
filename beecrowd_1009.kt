import java.util.Scanner
fun main(args: Array<String>) {
    var scan = Scanner(System.`in`)
    var name:String = scan.nextLine()
    var salary:Double = scan.nextDouble()
    var sale:Double = scan.nextDouble()

    var bonus:Double = sale * 0.15
    var payment:Double = salary + bonus
    println("TOTAL = R$ %.2f".format(payment))
}