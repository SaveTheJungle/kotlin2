package spectrumdata.exceptions

private fun userfun(): String {
    try {
        try {
            error("body")
        } finally {
            return "inner"
        }
    } finally {
        return "outer"
    }
}

fun main() {
    println(userfun())
}