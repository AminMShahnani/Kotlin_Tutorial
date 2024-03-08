fun main(){

    //Array List -- Not fixed

    var arrayList = arrayListOf(4, 2, 5, 8, 9, 6, 5, 3, 2, 1)

    arrayList.forEach {
        println(it)
    }

    arrayList.add(11)
    arrayList.add(12)

    arrayList.forEach {
        println(it)
    }

    val testList = arrayListOf(11, 12, 13, 14, 15, 16, 17,)
    arrayList.addAll(testList)

    arrayList.forEach {
        println(it)
    }

    












}