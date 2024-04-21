fun main() {

    val list = listOf(4, 3, 5, 6, 7, 98, 543)

    // lambda
    val result_lambda = list.fold(1000) {
        acc, i -> acc + 1
    }

    val result_lambda_return = list.fold(1000) {
        acc, i -> return@fold acc + 1
    }

    // anonymous
    val result_anon = list.fold(1000, fun(acc: Int, i: Int): Int {
        return acc + i
    })

    val result_anon_short = list.fold(1000, fun(acc: Int, i: Int) :Int = acc + i)
}