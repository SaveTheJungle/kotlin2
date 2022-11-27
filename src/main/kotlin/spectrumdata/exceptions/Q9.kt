package spectrumdata.exceptions

private fun userfun(): String {
    try {
        try {
            error("body")
        } finally {
            return "inner"
        }
    } finally {
    }
    return "body"
}

fun main() {
    println(userfun())
}
