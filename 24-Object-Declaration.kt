interface BaseInterface {

    fun printHello()

    fun printBye()
}

fun main() {
    val test = object :BaseInterface {

        override fun printHello() {
            println("Print Hello")
        }

        override  fun printBye() {
            println("Print Bye")
        }
    }

    test.printBye()
    test.printHello()
}