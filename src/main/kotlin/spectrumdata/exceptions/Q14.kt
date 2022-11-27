package spectrumdata.exceptions

import kotlin.concurrent.thread

private fun userfun(): String {
    var result: String? = null
//    val t = thread(unwindExceptions = true) {
//        result = "hello"
//        error("body")
//    }
//    t.join()
    return result ?: "world"
}

fun main() {
    try {
        println(userfun())
    } catch (e: Throwable) {
        println(e.message)
    }
}
