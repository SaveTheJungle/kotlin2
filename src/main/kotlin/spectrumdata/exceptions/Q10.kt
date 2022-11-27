package spectrumdata.exceptions

import java.io.Closeable

internal object ErrorClose : Closeable {
    override fun close() {
        error("on close")
    }
}

private fun userfun(): String {
    try {
        error("body")
    } finally {
        ErrorClose.close()
    }
}

private fun userfun2(): String {
    ErrorClose.use {
        error("body")
    }
}

fun main() {
    try {
        userfun()
    } catch (e: Throwable) {
        println(e.message)
    }
    try {
        userfun2()
    } catch (e: Throwable) {
        println(e.message)
        println(e.suppressed[0].message) // suppressed "on close" error
    }
}