import kotlin.io.*

//homem das caverna
fun add(x: Int, y: Int): Int{
    return x+y
}

//bruno
fun addnice(x: Int, y: Int): Int = x+y

//lambda
val addLambda: (Int,Int) -> Int = {x,y -> x+y}

fun main(args: Array<String>) {
    println(add(1,2))
    println(addnice(1,2))
    println(addLambda(5,7))


}