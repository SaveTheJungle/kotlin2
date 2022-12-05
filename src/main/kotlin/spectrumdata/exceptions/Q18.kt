package spectrumdata.exceptions

import kotlin.concurrent.thread

val locker = Object()
fun call() {
    locker.notifyAll()
    locker.wait()
}

fun main() {
    synchronized(locker) {
        val t = thread {
            synchronized(locker) {
                call()
            }
        }
        locker.notify()
        locker.wait()
        // Нет никаких проблем прощупать тред и даже отчасти сделать это предсказуемо
        // если создать точку взаимного останова как в примере, если останов сделан правильно то и дедлоков никаких нет
        println(t.stackTrace[2].methodName)

        println("###### stacktrace:")
        val st = t.stackTrace
        for (i in st.indices) {
            println("$i: ${st[i].className} - ${st[i].methodName}")
        }

        locker.notifyAll()
    }
}
