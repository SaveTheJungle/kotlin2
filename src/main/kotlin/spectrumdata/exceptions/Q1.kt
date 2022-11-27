package spectrumdata.exceptions

// https://docs.google.com/forms/d/e/1FAIpQLScLOwEqvo_6Dhu53peXpvfbUORp9fI-wVtdqnaTQQ8uWp6BHg/viewscore?viewscore=AE0zAgAzT8WJvXEGl4ZBQGLrOJ05QoDj73aNrV1oa7HYYBcLG5tIMhPw8WWzrRDZDk0X4X8
private fun errorer() {
    throw AssertionError("fail")
}

fun main() {
    try{
        errorer()
        println("no error")
    }catch (e: Exception){
        println("catched")
        throw e
    }
    println("at the end")
}