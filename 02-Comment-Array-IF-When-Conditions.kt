fun main(){

    // Comments

    // One Line Comments

    /*
    * Multiple Line Comment
    */

    // Conditions

    val grade = 15

    if (grade > 15) {
        println("Reject")
    } else {
        print("Accept")
    }

    /*
    logical conditions
        Less than: a < b
        Less than or equal to: a <= b
        Greater than: a > b
        Greater than or equal to: a >= b
        Equal to a == b
        Not Equal to: a != b
    */

    if (grade >= 15) {
        println("Reject")
    } else {
        print("Accept")
    }

    if (grade > 15) {
        println("Grade is greater than 15")
    } else if (grade == 15) {
        println("Grade is equal to 15")
    } else {
        println("Grade is less than 15")
    }

    if (grade >= 15) {
        println("Reject")
    } else {
        print("Accept")
    }

    if (grade == 15) {
        println("Grade is greater than 15")

        if (grade % 2 == 0) {
            println("True")
        } else {
            println("False")
        }

    } else if (grade > 15) {
        println("Grade is equal to 15")
    } else {
        println("Grade is less than 15")
    }

    if (grade > 10)
        println("Yes")
    else
        println("No")


    // When

    val month = 5

    when (month){
        1 -> println("Farvardin")
        2 -> println("Ordibehesht")
        3 -> println("Khordad")
        4 -> println("Tir")
        5 -> println("Mordad")
        6 -> println("Shahrivar")
        7 -> println("Mehr")
        8 -> println("Aban")
        9 -> println("Azar")
        10 -> println("Dey")
        11 -> println("Bahman")
        12 -> println("Esfand")

        else -> println("Invalid data")
    }

    when (month) {
        1, 2, 3, 4 -> println("Number is between 1-4")
        in 10..100 -> println("Number is between 10-100")
        !in 101..1000 -> println("Number is not between 101-1000")
        else -> println("Number is greater than 100")
    }

}