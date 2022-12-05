package spectrumdata.exceptions

fun main() {
    println(Thread.currentThread().stackTrace[0].methodName)
    println(Thread.currentThread().stackTrace[1].methodName)
}
// Выведет:
// getStackTrace
// main
