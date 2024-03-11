class BankAccount(firstPrice :String){
    var price :String = firstPrice
        get() {
            return field + "USD"
        }
        set(value) {
            field = value
        }

//    fun getPrice() :String {
//        return price + "USD"
//    }
//
//    fun setPrice(newPrice :String) {
//        price = newPrice
//    }
}
fun main(){

    // getter - setter

//    val testAccount = BankAccount("10000")
//    println(testAccount.getPrice())

    val testAccount = BankAccount("10000")
    println(testAccount.price)


}