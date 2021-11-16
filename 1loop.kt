import kotlin.math.*

fun f(x:Double):Double{
    return(x*exp(x) + 2*sin(x) - sqrt(abs(x.pow(3) - x.pow(2))))
}

fun main() {
    val list = mutableListOf<Double>()
    val A:Double = -5.0
    val B:Double = 5.0
    val x:Double = 0.1
    var i:Double = A
    while (i <= B) {
        list.add(f(i))
    	println("f(%.1f): %.4f".format(i, list.last()))
        i += x
    }
    //println("B1: % function values have an odd intteger part.".format(list.count { e -> e.toInt() % 2 != 0 })
    println( list.filter{e -> abs(e % 1) > 0.2 && abs(e % 1) < 0.8 }.average() )
    //println("B2: % function values have an odd intteger part.".format()
}