package spectrumdata.exceptions

import kotlin.concurrent.thread

private fun userfun(): String {
    var result : String? = null
    thread {
        result = "hello"
        error("body")
    }
    return result ?: "world"
}

fun main() {
    try{
        println(userfun())
    }catch (e: Throwable){
        println(e.message)
    }
}
