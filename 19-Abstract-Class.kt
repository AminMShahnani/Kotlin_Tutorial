abstract class Animal (){

    abstract fun talk()

}

class Goat() :Animal() {
    override fun talk() {
        println("MA MA")
    }
}

class Giraffe() :Animal() {
    override fun talk() {
        println("HUM HUM")
    }
}

fun main() {

}