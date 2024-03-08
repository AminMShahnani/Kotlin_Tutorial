fun main() {

    // For Loop
    for (i in 1..10) {

        println(i)

    }

    var result = 0
    for(number in 1..100) {
        result = result + number
    }
    println(result)


    for (i in 1..5){
        for (j in 1..5) {
            print("*")
        }

        print("\n")
    }

    for (i in 1..500) {
        if (i ==300) {
            break
        }
        println(i)
    }

    for (i in 1..20){
        if (i == 10){
            continue
        }
        print(i)
    }

    var test = 10
    while(test != 100){
        println(test)
        test++
    }

    var test2 = 10
    do{
        println(test2)
        test2++
    } while (test2 != 100)
}