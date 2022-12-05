package spectrumdata.exceptions

// последний параметр - writeableStackTrace = false
class MyOnlyMessageError2(message: String) : Throwable(
    message, null, false, false
)

fun main() {
    try {
        throw MyOnlyMessageError2("hello")
    } catch (e: Throwable) {
        // ошибка (index out of)
        // Стектрейс записывается при создании исключения
        // и если мы запретили стектрейсы то, получаем пустой массив из метода getStacktrace()
        println(e.stackTrace[0].methodName)
    }
}
