package model

class HolaRequest(val name: String) {
    val greeting: String = "Hola"
    var prefix: String = "Senior"

    constructor(name: String, prefix: String) : this(name) {
        this.prefix = prefix
    }
}
