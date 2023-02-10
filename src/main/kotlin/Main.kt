import kotlin.io.*

fun main(args: Array<String>) {

    //use mutableListOf para lista mutávies, e ListOf para lista não mutávies
    val lista = mutableListOf(
        "Kotlin",
        "Java",
        "JS",
        "Python",
        "C",
    )

    //usado para adicionar elementos a lista mutável
    lista.add("C++")

    //the virgin
    for (i in 0..lista.size-1)
        println(lista[i])
    //the chad
    for (i in lista)
        println(i)
    //the thad
    lista.forEach{lang->
        println(lang)
    }
    //the lad
    lista.forEachIndexed {indice, linguagem ->
        println("$indice -> $linguagem")
    }

    //criar uma lista filtrada
    val listaFiltrada = lista.filter {
        it.contains("C")
    }

    listaFiltrada.forEach{lang->
        println(lang)
    }
}