fun main(){

    // Array
    val scores :Array<Int> = arrayOf(17, 20, 16, 14, 5, 9, 10, 11, 14, 13)

    println( scores[0] )

    for (i in 0..9){
        println(scores[i])

        if(scores[i] > 15){
            println(scores[i])
        }
    }

    print(scores.size)

    for(i in scores.size -1 downTo 0){
        println(i)
        println(scores[i])
        print("\n")
    }

    for(i in 0 downTo 0 step 2){
        println(i)
    }

    for(item in scores){
        println(item)
    }

    scores.forEach {
        println(it)
    }

    scores.forEach { item ->
        println(item)
    }

    scores.forEachIndexed { index, item ->
        println(" $index : $item")
    }

    val test = scores.get(5)
    print(test)

    val test2 = scores.set(0, 1000)
    scores.forEach {
        println(it)
    }

    scores[2] = 200

    for (i in scores.indices) {
        println(i)
    }

    scores.sort()

    for(i in scores){
        println(i)
    }





}