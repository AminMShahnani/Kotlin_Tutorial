open class HowPerson(
    protected val firstName :String,
    open protected val familyName: String,
    protected val mobileNumber :String) {


    open fun introduce(){
        println("My name is $firstName $familyName and my number is $mobileNumber ")
    }

}

class HowStudent(
    private val studentId :Int,
    private val start :Int,
    private val passedCourses :Int,
    private val nameUniversity :String,
    private val rankUniversity :String,
    name :String,
    familyName :String,
    mobile :String
) :HowPerson(name, familyName, mobile) {

    override fun introduce() {
        super.introduce()

        println("name : $name")
        println("family : $familyName")
        println("mobile number : $mobileNumber")
        println("University : $nameUniversity")
        println("University rank : $rankUniversity")
    }

}

fun main() {

    val amin = HowStudent(
        1234,
        1400,
        18,
        "Sharif",
        "12",
        "amin",
        "Shah",
        "09876"
    )

    amin.introduce()


}