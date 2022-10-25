import companion.FactoryCreator
import companion.FirstRelatedClass
import companion.SecondRelatedClass
import kotlin.random.Random

class Main {
    companion object {
        @JvmStatic fun main(args: Array<String>) {
            printRandomNumbers(args)
            printGreetings(args)
            printEmptyClass()
            printCompanions()
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
