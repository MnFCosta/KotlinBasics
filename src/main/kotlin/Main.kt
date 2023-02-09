import kotlin.io.*

fun main(args: Array<String>) {

    for(i in 10 downTo 0 step(2))
        println(i)

    var i = 1

    do{
        println(i)
        i++
    }while (i!=11)
}