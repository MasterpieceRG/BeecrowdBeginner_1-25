import java.util.Scanner

fun main(args: Array<String>) {
    var scan = Scanner(System.`in`)
    var num = scan.nextDouble()

    when {
        num >= 0.0 && num <= 25.0 -> println("Intervalo [0,25]")
        num >= 25.0 && num <= 50.0 -> println("Intervalo (25,50]")
        num >= 50.0 && num <= 75.0 -> println("Intervalo (50,75]")
        num >= 75.0 && num <= 100.0 -> println("Intervalo (75,100]")
        else -> println("Fora de intervalo")
    }
}