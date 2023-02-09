import kotlin.io.*

fun main(args: Array<String>) {
    var x: Int = 2
    var y: String

    //estrutura para atribuir resultados de uma condicional a uma variável diretamente
    y = if(x==1)
        "um"
    else if (x==2)
        "dois"
    else
        "maior que dois"

    //estrutura para atribuir resultados de um switch a uma variável diretamente
    y = when(x){
        1-> "um"
        2-> "dois"
        else -> "maior que dois"
    }

    println(y)


}