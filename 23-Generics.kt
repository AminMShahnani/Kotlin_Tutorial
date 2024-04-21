fun <T> printing(x :T){
    println(x)
}

fun <T> printingMany(x :T, y :T, z :T) {
    println(" $x $y $z")
}

fun main(){
    printing(12)
    printing("Amin")
    printing(12.34)

    printingMany(2.13, 2, "Amin")
}