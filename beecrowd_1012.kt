import java.util.Scanner
fun main(args: Array<String>) {
    var scan = Scanner(System.`in`)
    var A = scan.nextDouble()
    var B = scan.nextDouble()
    var C = scan.nextDouble()
    var pi = 3.14159

    var TRIANGULO = 0.5 * A * C
    var CIRCULO = pi * C * C
    var TRAPEZIO = 0.5 * (A + B) * C
    var QUADRADO = B * B
    var RETANGULO = A * B
    println("TRIANGULO: ${"%.3f".format(TRIANGULO)}")
    println("CIRCULO: ${"%.3f".format(CIRCULO)}")
    println("TRAPEZIO: ${"%.3f".format(TRAPEZIO)}")
    println("QUADRADO: ${"%.3f".format(QUADRADO)}")
    println("RETANGULO: ${"%.3f".format(RETANGULO)}")
}