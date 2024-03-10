open class Body(val name :String, val family: String, val mobile :String) {


    var firstName :String = name
    var familyName :String = family
    var mobileNumber :String = mobile

    fun Intruduce(){
        println("My name is $firstName $familyName and my number is $mobileNumber ")
    }

}

class Student(
    studentId :Int,
    start :Int,
    PassedCourses :Int,
    nameUniversity :String,
    rankUniversity :String,
    name :String,
    familyName :String,
    mobile :String
) :Body(name, familyName, mobile) {


}

fun main() {




}