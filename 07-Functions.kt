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

fun numberOfTop(list :List<Int>, top :Int) :Int {
    var count = 0

    list.forEach{
        if (it > top) {
            count++
        }
    }

    return count
}

fun numberOfTopGrade(list :List<Int>, top :Int = 15) :Int {
    var count = 0

    list.forEach{
        if (it > top) {
            count++
        }
    }

    return count
}


fun numberOfTopScore(list :List<Int>, top :Int = 15) :Unit {
    var count = 0

    list.forEach{
        if (it > top) {
            count++
        }
    }

}

fun numberOfTopTeacher(list :List<Int>, top :Int = 15) :Pair<Int, Int> {
    var count = 0

    list.forEach{
        if (it > top) {
            count++
        }
    }

    return Pair(count, 0)
}



fun main(){

    printName()

    val num1 = readLine()!!.toInt()
    val num2 = readLine()!!.toInt()
    sumTwoNumber(num1, num2)

    printMyName("Amin")

    val listOfGrade = listOf(10, 12, 14, 23, 16, 19, 16, 17)
    numberOfTopStudents(listOfGrade)

    numberOfTop(listOfGrade, 14)

    val topScore = 13
    val result = numberOfTop(list = listOfGrade, top = topScore)
    println(result)

    val topGrade = numberOfTopGrade(list = listOfGrade)
    println(topGrade)

    val twoPair = numberOfTopTeacher(list = listOfGrade, top = topScore)
    println(twoPair.first)
    println(twoPair.second)

    val (firstNumber, secondNumber) = numberOfTopTeacher(list = listOfGrade, top = topScore)
    println(firstNumber)
    println(secondNumber)

}