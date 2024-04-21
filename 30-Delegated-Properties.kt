class Test {

    val name :String by lazy {
        "Amin"
    }
}

fun main() {
    val test = Test()
    println(test.name)
}