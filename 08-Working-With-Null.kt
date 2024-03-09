fun main() {

    // Null Safety

    // Null

    // NullPointerExceptions

    var name :String = "Amin"

    var familyName :String? = null

    // Way 1
    if (familyName != null) {
        println(familyName.toInt())
    }

    // Kotlin Way
    familyName?.toInt() // check if not null run code
    

}