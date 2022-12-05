package spectrumdata.exceptions

fun main() {
    try {
        error("1")
    } catch (e: Throwable) {
        println(e.stackTrace[0].methodName)
    }
    val e = Exception("1")
    println(e.stackTrace[0].methodName)
}
// Будет main; main
// Стек заполняется при создании исключения
