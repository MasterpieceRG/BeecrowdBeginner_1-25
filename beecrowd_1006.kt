import java.util.Scanner
fun main(args: Array<String>) {
    var scan = Scanner(System.`in`)
    var num1 = scan.nextDouble()
    var num2 = scan.nextDouble()
    var num3 = scan.nextDouble()

    var avarage = ((num1*0.2) + (num2*0.3) + (num3*0.5))
    println("MEDIA = %.1f".format(avarage))
}