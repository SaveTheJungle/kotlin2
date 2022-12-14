package spectrumdata.exceptions

private fun userfun(): List<String> {
    val calls = mutableListOf<String>()
    try {
        error("it's error")
    } catch (e: Throwable) {
        calls.add("catch")
    } finally {
        calls.add("finally")
    }
    return calls
}

fun main() {
    val result = userfun()
    println(result.joinToString())
}
