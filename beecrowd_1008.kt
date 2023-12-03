import java.util.Scanner
fun main(args: Array<String>) {
    var scan = Scanner(System.`in`)
    var num = scan.nextInt()
    var hour = scan.nextInt()
    var hourlyRate = scan.nextDouble()

    var salary = hour*hourlyRate
    println("NUMBER = $num")
    println("SALARY = U$ %.2f".format(salary))
}