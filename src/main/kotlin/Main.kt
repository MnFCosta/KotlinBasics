import kotlin.io.*

//homem das caverna
fun add(x: Int, y: Int): Int{
    return x+y
}

//bruno
fun addnice(x: Int, y: Int): Int = x+y

//lambda
val addLambda: (Int,Int) -> Int = {x,y -> x+y}

// potencia

val potencia: (Int,Int) -> Int = {x,y ->
    var retorno = 1
    for(i in 1..y){
        retorno*=x
    }
    retorno
}

val metade: (Int) -> Float = {x ->
    var float = x.toFloat()
    var half: Float = float/2
    half
}

val imparPar: (Int) -> String = {x ->
    var retorno = ""
    if (x % 2 == 0){
        retorno = "Par"
    }else{
        retorno = "Impar"
    }
    retorno
}


// formato lambda nome: (tipo de argumentos) -> tipo de retorno {}



fun main(args: Array<String>) {
    println(potencia(5,2))
    println(metade(1))
    println(imparPar(1))


}