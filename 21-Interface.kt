 class Class_A(private val dataEvent :DataEvent){

     fun getData(){
         val data :List<String> = listOf(
             "Amin",
             "Saeed",
             "Sara",
             "Samin",
             "Aida",
             "Ali"
         )

         dataEvent.onReceived(data)
     }
 }

 class Class_B() :DataEvent{

     fun requestData(){
         val test = Class_A(this)
         test.getData()
     }

     fun printData(){
         println("Data received and shown")
     }

     override fun onReceived(list: List<String>) {
         printData()
     }
 }

 interface  DataEvent {
     fun onReceived(list :List<String>)
 }

 fun main(){
     val test = Class_B()
     test.requestData()
 }

