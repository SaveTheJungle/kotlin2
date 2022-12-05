package spectrumdata.exceptions

import kotlin.Exception

fun main() {
    try {
        throw Exception()
    } catch (e: Throwable) {
        println(e.stackTrace[0].methodName)
        println(e.stackTrace[1].methodName)
        // Как бы это ни было странно, особенно с учетом предыдущего вопроса,
        // но в стеке ровно 2 единицы и обе main! Ну тут вопрос к авторам JVM или Kotlin...
    }
}
