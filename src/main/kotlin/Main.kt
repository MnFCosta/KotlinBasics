import kotlin.io.*

fun main(args: Array<String>) {

    var i: String = readLine() ?: ""
    var x: Int = i.toIntOrNull() ?: 0
    println(x)
}