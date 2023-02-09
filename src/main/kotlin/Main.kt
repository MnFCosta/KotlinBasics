import kotlin.io.*

fun main(args: Array<String>) {
    var x: Int = 1
    var y: Int = 2

    if(x>y)
        println("$x é maior que $y")
    else
        println("$y é maior que $x")

    //diferente do Java, não há switch case e sim when

    when(x){
        1-> {
            println("um")
            println("my pain is constant and sharp")
        }
        2-> println("dois")
        3-> println("tres")
        else-> println("maior que tres")
    }
}