import java.util.Scanner
fun main(args: Array<String>) {
    var scan = Scanner(System.`in`)
    var num1 = scan.nextDouble()
    var num2 = scan.nextDouble()

    var avarage = ((num1*0.35) + (num2*0.75))/(0.35+0.75)
    println("MEDIA = %.5f".format(avarage))
}