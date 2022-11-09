import companion.FactoryCreator
import companion.FirstRelatedClass
import companion.SecondRelatedClass
import inheritance.Derived
import kotlinx.coroutines.runBlocking
import ktor.KtorExamples
import model.HolaRequest
import model.RandomRequest
import kotlin.random.Random

class Main {
    companion object {
        @JvmStatic fun main(args: Array<String>) {
            printRandomNumbers(args)
            printGreetings(args)
            printEmptyClass()
            printCompanions()
            Derived.printDerived()
            printNullSafety()
            getAndPrintGoogle()
        }
    }
}

fun printRandomNumbers(args: Array<String>) {
    var req = RandomRequest(3, 100)
    for (i in 1..req.repeat) {
        println(Random.nextInt(0, req.upperBound))
    }
}

fun printGreetings(args: Array<String>) {
    val req = HolaRequest("Кифир")
    println("${req.greeting} ${req.prefix} ${req.name}")
}

class Dummy

fun printEmptyClass() {
    println(Dummy())
    println(Dummy() == Dummy())
    println(Dummy() === Dummy())
}

fun printCompanions() {
    val factoryOne: FactoryCreator = FirstRelatedClass.Factory
    println(factoryOne.produce().someFunction())

    val factoryTwo: FactoryCreator = SecondRelatedClass.Factory
    println(factoryTwo.produce().someFunction())
}

fun printNullSafety() {
    var s0: String
    var s1: String?
    // s0 = null // can not assign a null
    s0 = "123"
    s1 = null
    println("'$s0'.length is ${s0.length}")
    // println("$s1 ${s1.length}") // Nope. Can't do that

    val listWithNulls: List<String?> = listOf("Kotlin", null)
    for (item in listWithNulls) {
        item?.let { print("$it ") } // prints Kotlin and ignores null
    }
    println()
    for (item in listWithNulls) {
        print("$item ")
    }
    println()
}

fun getAndPrintGoogle() {
    runBlocking {
        println("GET google.ru")
        println("===============================")
        val text = KtorExamples().getGoogle()
        println("===============================")
    }
}
