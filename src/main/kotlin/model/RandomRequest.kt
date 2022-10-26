package model

data class RandomRequest(
    val repeat: Int = 1,
    var upperBound: Int = 100
)
