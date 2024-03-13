class StudentsClass (first_name :String, teacher :String) {

    lateinit var name :String
    lateinit var nameOfTeacher :String

    init {
        name = first_name
        nameOfTeacher = teacher
    }
}