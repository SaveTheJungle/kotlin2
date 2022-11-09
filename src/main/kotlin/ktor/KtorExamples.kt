package ktor

import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.engine.cio.*
import io.ktor.client.plugins.logging.*
import io.ktor.client.request.*
import io.ktor.client.statement.*

class KtorExamples(
    val client: HttpClient = HttpClient(CIO) {
        install(Logging)
    }
) {
    suspend fun getGoogle(): String {
        return this.client.get("https://google.ru").body()
    }
}
