package spectrumdata.exceptions

import kotlin.Exception

val e = Exception()

fun main() {
    try {
        throw e
    } catch (e: Throwable) {
        // Выведет что-то непонятное - просто какой-то особый стек который заполняется при создании исключения
        println(e.stackTrace[0].methodName)
    }
}
