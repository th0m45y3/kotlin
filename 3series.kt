import kotlin.math.*

fun f(x:Int):Double{
    var n:Double = x.toDouble()
    return( (1 + n%2*(-2)) / (n*n*n + 10*n) )
}

fun sumN(n:Int):Double{
    var result:Double = -1.0 / 11.0
    for(i:Int in 2..n){
        result += f(i)
    }
    return(result)
}

fun sumEps(eps:Double){
    var n:Int = 1
    var result:Double = f(n)
    while(abs(result)>eps) {
        result = f(n)
        n++
    }
    println("Last number: $n")
    println("Series sum: %.15f".format(sumN(n)))
}

fun main() {
    println(sumN(5))
    sumEps(0.001)
}