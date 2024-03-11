class Students(n :String, f :String, i :String){

    val name :String = n
    val familyName :String = f
    val idStudents :String = i

    fun intriduce(){
        println("My name is $name $familyName and my id is $idStudents")

    }

    companion object {
        val nameOfUniversity = "MIT"
    }
}

fun main(){
    val amin = Students("Amin", "Shah", "123")
    amin.intriduce()

    val university = Students.nameOfUniversity

    println(university)
}