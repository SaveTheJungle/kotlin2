package companion

// https://www.baeldung.com/kotlin/companion-object
interface Theme {
    fun someFunction(): String
}

abstract class FactoryCreator {
    abstract fun produce(): Theme
}

class FirstRelatedClass : Theme {
    companion object Factory : FactoryCreator() {
        override fun produce() = FirstRelatedClass()
    }
    override fun someFunction(): String {
        return "I am from the first factory."
    }
}

class SecondRelatedClass : Theme {
    companion object Factory : FactoryCreator() {
        override fun produce() = SecondRelatedClass()
    }
    override fun someFunction(): String {
        return "I am from the second factory."
    }
}

