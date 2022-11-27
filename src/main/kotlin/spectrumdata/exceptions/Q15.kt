package spectrumdata.exceptions

import kotlin.concurrent.thread

private fun userfun(): String {
    var exception: Throwable? = null
    var result: String? = null
    val t = thread {
        try {
            error("body")
        } catch (e: Throwable) {
            exception = e
            result = "hello"
        }
    }
    t.join()
    if (exception != null) {
        throw exception!!
    }
    return result ?: "world"
}

fun main() {
    try {
        println(userfun())
    } catch (e: Throwable) {
        println(e.message)
    }
}
