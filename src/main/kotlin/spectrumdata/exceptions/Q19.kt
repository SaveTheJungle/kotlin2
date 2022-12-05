package spectrumdata.exceptions

class MyOnlyMessageError(message: String) : Throwable(
    message, null, false, false
)

fun main() {
    val e = MyOnlyMessageError("hello")
    // Будет index out of...
    println(e.stackTrace[0].methodName)
    // Даже если writableStackTrace установлен в false,
    // но все равно метод getStacktrace() делает проверку и возвращает пустой массив стектрейсов
}
