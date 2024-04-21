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

    var height: Int by Delegates.vetoable(165) { property, oldValue, newValue ->
        println("Old value : $oldValue")
        println("New Value : $newValue")

        height > 165
    }
}

fun main() {
    val test = Test()
    println(test.name)

    test.age = 100

    test.height = 170
}