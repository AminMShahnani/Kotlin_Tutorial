class People(val name :String, val family: String, val mobile :String) {


//    lateinit var firstName :String
//    lateinit var familyName :String
//    lateinit var mobileNumber :String
//
//    init {
//        this.firstName = name
//        this.familyName = family
//        this.mobileNumber = mobile
//
//    }

//    fun Intruduce(){
//        println("My name is $firstName $familyName and my number is $mobileNumber ")
//    }

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

    val rudy = People("Amin", "Shahnani", "0917")

    rudy.sayHello()


}