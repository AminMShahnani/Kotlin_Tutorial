fun main(){

    try {
        val test = 10/0

        val data :String? = null
        data!!.toInt()

    } catch (ex :ArithmeticException) {
        println(ex.message)
    }
    catch ( ex :NullPointerException) {
        println(ex.message)
    }

    print("Hello World")


}