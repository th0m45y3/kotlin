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
    var counter:Int = 0
    while (i <= B) {
        list.add(f(i))
    	println("f(%.1f): %.4f".format(i, list.last()))
        if(i >= -1 && i <= 1) {
            if(list.last() >= -1 && list.last() <= 1) {
                var result = String.format("%.4f", i * list.last() ).toDouble()
                if( result <= 0 ) counter += 1
            }
        }
        i += x
    }
    println("Function values average: %.4f".format(list.average()))
    println("$counter points in the figure")
}