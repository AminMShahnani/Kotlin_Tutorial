class Human(name :String, family: String, mobile :String) {

//    lateinit var firstName :String
//    lateinit var familyName :String
//    lateinit var mobileNumber :String

    var firstName :String = name
    var familyName :String = family
    var mobileNumber :String = mobile

//    constructor(name :String, family: String, mobile :String) :this(){
//        firstName = name
//        familyName = family
//        mobileNumber = mobile
//    }
//
//    constructor(name :String, family :String): this() {
//        firstName = name
//        familyName = family
//        mobileNumber = "No Mobile"
//    }

//    init {
//        println("Hello calss human")
//
//        firstName = "${name} 100"
//
//    }

    fun Intruduce(){
        println("My name is $firstName $familyName and my number is $mobileNumber ")
    }

    fun sayHello(){
        println("Hello Everybody")
    }

    fun sayGoodBye(){
        println("Bye Bye")
    }

    fun eatBreakfast(){
        println("I am eating breakfast")
    }

    fun goingToSchool(){
        println("I am going to school")
    }

    fun sleep(){
        println("I am sleeping")
    }

    fun eatFruit(nameFruit :String){
        println("I am eating $nameFruit")
    }
}


fun main() {

    val rudy = Human("Amin", "Shahnani", "0917")

//    rudy.Intruduce()
//    rudy.sayHello()
//    rudy.eatBreakfast()
//    rudy.goingToSchool()
//    rudy.eatFruit("Banana")
//    rudy.sayGoodBye()
//    rudy.sleep()

//    println(rudy.firstName)

//    val amin = Human()
//    amin.firstName = "Amin"
//    amin.familyName = "Shah"
//    amin.mobileNumber = "098"
//
//    val hassan = Human("Hassan", "Hassani", "09876")
//
//    val Samir = Human("Samir", "Samir")
//    println(Samir.mobileNumber)

    rudy.Intruduce()

    // Visibility modifier : public - private - internal - protected
    /*
    *  Public : Show to all
    *  Private : Show only to members of that class
    *  Internal : Only show to this module
    *  Protected : Only show to thos class member of child classes*/



}