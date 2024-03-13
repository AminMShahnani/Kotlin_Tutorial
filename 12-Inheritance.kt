open class Body(protected val name :String, protected val family: String, protected val mobile :String) {


    var firstName :String = name
    var familyName :String = family
    var mobileNumber :String = mobile

    fun Intruduce(){
        println("My name is $firstName $familyName and my number is $mobileNumber ")
    }

}

class Student(
    private val studentId :Int,
    private val start :Int,
    private val passedCourses :Int,
    private val nameUniversity :String,
    private val rankUniversity :String,
    name :String,
    familyName :String,
    mobile :String
) :Body(name, familyName, mobile) {

    fun introduceStudent(){

        println("My name is $name $familyName")
        println("My number is $mobileNumber")
        println("My university is $nameUniversity and rank is $rankUniversity")
        println("I am start $start and my id is $studentId")
        println("I passed $passedCourses course")

    }

}

fun main() {

    val amin = StudentsClass(
        1234,
        1400,
        18,
        "Sharif",
        "12",
        "amin",
        "Shah",
        "09876"
        )

    amin.introduceStudent()


}