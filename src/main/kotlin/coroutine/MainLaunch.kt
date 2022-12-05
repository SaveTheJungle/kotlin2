package coroutine

import kotlinx.coroutines.*


fun main() = runBlocking {
    doWorld()
    doWorld2()
}

// Запускаем корутину внутри coroutineScope
// Сначала выведет Hello, потом World
suspend fun doWorld() = coroutineScope {  // this: CoroutineScope
    launch {
        delay(1000L)
        println("World!")
    }
    println("Hello")
}

// Скорее всего все так же выведет сначала Hello, а потом World
suspend fun doWorld2() = coroutineScope {  // this: CoroutineScope
    launch {
        delay(1000L)
        println("World!2")
    }
    println("Hello2")
}
