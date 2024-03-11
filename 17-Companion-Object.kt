open class Object(){
    val human = "human"

    companion object{

    }
}

class Students(n :String, f :String, i :String){

    val name :String = n
    val familyName :String = f
    val idStudents :String = i

    fun intriduce(){
        println("My name is $name $familyName and my id is $idStudents")

    }

    companion object amin :Object() {

        const val newObject :String = "Amin"

        @JvmStatic
        val nameOfUniversity = "MIT"

        @JvmStatic
        fun printUniversityName(){
            println("MIT")
        }
    }
}

fun main(){
    val amin = Students("Amin", "Shah", "123")
    amin.intriduce()

    val university = Students.nameOfUniversity

    println(university)

    Students.printUniversityName()
}