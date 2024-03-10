class Human(name :String, family: String, mobile :String) {
    val first_name :String = name
    val familyName :String = family
    val mobile_number :String = mobile

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

    val rudy = Human()

}