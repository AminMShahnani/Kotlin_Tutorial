class Human(name :String, family: String, mobile :String) {
    val firstName :String = name
    val familyName :String = family
    val mobileNumber :String = mobile

    fun Intruduce(){
        println("My name is $firstName $familyName and my number is $mobileNumber ")
    }

    fun syHello(){
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

    rudy.
}