package spectrumdata.exceptions

private fun userfun(): String {
    try {
        error("body")
    } catch (e: Throwable) {
        error("catch")
    } finally {
        error("finally")
    }
}

fun main() {
    try{
        userfun()
    }catch (e: Throwable){
        println(e.message)
    }
}