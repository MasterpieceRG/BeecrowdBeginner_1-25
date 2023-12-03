import java.util.Scanner
import kotlin.math.sqrt

fun main(args: Array<String>) {
    var scan = Scanner(System.`in`)
    var a = scan.nextDouble()
    var b = scan.nextDouble()
    var c = scan.nextDouble()

    var bh = (b*b) - (4*a*c)

    if(bh > 0 && a.toInt() != 0) {
        bh = sqrt(bh)
        var R1 = (-b + bh) / (2*a)
        var R2 = (-b - bh) / (2*a)
        println("R1 = ${"%.5f".format(R1)}")
        println("R2 = ${"%.5f".format(R2)}")
    }else {
        println("Impossivel calcular")
    }
}