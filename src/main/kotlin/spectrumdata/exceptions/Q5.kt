package spectrumdata.exceptions

import kotlin.system.exitProcess

private fun userfun(): String {
    var wasCatch: Boolean = false
    var wasFinally: Boolean = false
    try {
        error("it's error")
    } catch (e: Throwable) {
        wasCatch = true
        return "catch and finally: $wasFinally"
    } finally {
        if (!wasCatch) {
            exitProcess(-1)
        }
        wasFinally = true
        println("finally: $wasFinally")
    }
    return "aftertry"
}

fun main() {
    val result = userfun()
    println(result)
}