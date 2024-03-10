class Human(name :String, family: String, mobile :String) {
    var firstName :String = name
    val familyName :String = family
    val mobileNumber :String = mobile

    init {
        println("Hello calss human")

        firstName = "${name} 100"

    }

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

    rudy.Intruduce()
    rudy.sayHello()
    rudy.eatBreakfast()
    rudy.goingToSchool()
    rudy.eatFruit("Banana")
    rudy.sayGoodBye()
    rudy.sleep()

    println(rudy.name)
}