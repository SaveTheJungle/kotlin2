package spectrumdata.exceptions

// последний параметр - writeableStackTrace = true
class SpecialTracedException : Throwable("", null, false, true) {
    init {
        this.stackTrace = arrayOf(
            StackTraceElement("hello", "world", "and", 1)
        )
    }
}

fun main() {
    try {
        throw SpecialTracedException()
    } catch (e: Throwable) {
        println(e.stackTrace[0].methodName)
    }
}
