import kotlin.io.*

fun main(args: Array<String>) {

//    Tratamento de null
//    ? = impede que valores nulos deem bigode
    var nome: String? = null

    println(nome?.length)
//    operador elvis ?: checa se um valor é nulo, caso for utiliza um valor de segurança
    println(nome?.length ?: "bruh")
}