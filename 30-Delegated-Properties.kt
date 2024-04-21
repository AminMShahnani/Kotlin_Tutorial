class Test {

    val name :String by lazy {
        println("Lazy")
        "Amin"
    }
}

fun main() {
    val test = Test()
    println(test.name)
}