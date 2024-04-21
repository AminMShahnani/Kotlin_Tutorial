import kotlin.properties.Delegates

class Test {

    val name :String by lazy {
        println("Lazy")
        "Amin"
    }

    var age :Int by Delegates.observable(20) {
        property, oldValue, newValue ->

        println("Old value : $oldValue \n new value : $newValue")
    }
}

fun main() {
    val test = Test()
    println(test.name)

    test.age = 100
}