import java.util.Scanner
fun main(args: Array<String>) {
    var scan = Scanner(System.`in`)
    var A = scan.nextInt()
    var B = scan.nextInt()
    var C = scan.nextInt()
    var D = scan.nextInt()

    var diference = (A * B - C * D)
    println("DIFERENCA = $diference")
}