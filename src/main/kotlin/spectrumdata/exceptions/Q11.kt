package spectrumdata.exceptions

import java.io.Closeable

internal object ErrorClose2 : Closeable {
    override fun close() {
        error("on close")
    }
}

private fun userfun2(): String {
    ErrorClose2.use {
        error("body")
    }
}

fun main() {
    try {
        userfun2()
    } catch (e: Throwable) {
        println(e.message)
        println(e.suppressed[0].message)
    }
}