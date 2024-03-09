fun main() {

    // Null Safety

    // Null

    // NullPointerExceptions

    var name :String = "Amin"

    var familyName :String? = null

//    // Way 1
//    if (familyName != null) {
//        println(familyName.toInt())
//    }
//
//    // Kotlin Way
//    familyName?.toInt() // check if not null run the code
//    familyName?.toInt() ?: "20" // check if not null run the code but if null equal to "20"
//
//    familyName!!.toInt() // If familyName is null run the code and throw out nullPointException
//
//
    var lastName :String? = null
    lastName?.let{
        it.toInt()
    }

}