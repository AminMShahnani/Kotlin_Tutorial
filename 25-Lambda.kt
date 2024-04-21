fun main() {
    val sum: (Int, Int) -> Int = { x: Int, y: Int -> x + y}

    println(sum(2, 5))
}