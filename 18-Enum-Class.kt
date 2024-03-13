enum class Season {
    SPRING,
    SUMMER,
    WINTER,
    AUTUMN
}


fun main(){

    val test = Season.SPRING

    when (test) {
        Season.SPRING -> println("Spring")
        Season.SUMMER -> println("Summer")
        Season.WINTER -> println("Winter")
        Season.AUTUMN -> println("Autumn")

    }

}