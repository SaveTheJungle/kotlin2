package inheritance

open class Base(val x: Int)

class Derived(y: Int) : Base(y) {
    override fun toString(): String {
        return "Derived x: ${this.x}, y: ${this.x * 2}"
    }

    companion object {
        fun printDerived() {
            println(Derived(10))
        }
    }
}


