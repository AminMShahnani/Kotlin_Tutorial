fun printName(){
    println("Amin")
}

fun sumTwoNumber(a: Int, b: Int){
    println(a + b)
}

fun printMyName(name: String){
    println(name)
}

fun numberOfTopStudents(list :List<Int>) {
    var count = 0

    list.forEach{
        if (it > 18) {
            count++
        }
    }

    println(count)
}


fun main(){

    printName()

    val num1 = readLine()!!.toInt()
    val num2 = readLine()!!.toInt()
    sumTwoNumber(num1, num2)

    printMyName("Amin")

    val listOfGrade = listOf(10, 12, 14, 23, 16, 19, 16, 17)
    numberOfTopStudents(listOfGrade)











}