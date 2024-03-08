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

    arrayList.remove(10)
    arrayList.forEach {
        println(it)
    }

    arrayList.clear()
    arrayList.forEach {
        println(it)
    }

    //List

    val list = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)

    list.forEach {
        println(it)
    }

    println(list)

    //Mutable List

    val mutableList = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9)


    // array      => Fiexed Size
    // arrayList  => Not Fixed
    // list       => Different storage
    //mutableList => a list that can change -Mutable










}