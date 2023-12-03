import java.util.Scanner

fun main(args: Array<String>) {
    var scan = Scanner(System.`in`)
    var tk = scan.nextInt()
    var wallet = tk

    var bankNotes = arrayOf(100, 50, 20, 10, 5, 2, 1)
    var count = arrayOf(0, 0, 0, 0, 0, 0, 0)

    for(i in 0 until bankNotes.size) {
        if(tk >= bankNotes[i]) {
            count[i] = tk / bankNotes[i]
            tk %= bankNotes[i]
        }
    }

    println(wallet)
    for(i in 0 until bankNotes.size) {
        println("${count[i]} nota(s) de R$ ${bankNotes[i]},00")
    }
}