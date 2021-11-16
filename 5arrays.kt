fun createArray(n:Int, a:Int, b:Int): IntArray {
    var arr = IntArray(n)
    for (i in 0..n-1) {
        arr[i] = (a..b).random()
    }
    return(arr)
}

fun printArray(arr:IntArray) {
    for (i in 0..arr.size-1) println(arr[i])
}

fun compositeCheck(i:Int): Boolean {
    if (i == 2 || i == 1) return false
    if (i % 2 == 0) return true
    var div:Int = 3
    while (div < i) {
        if (i % div == 0) return true
        div += 2
    }
    return false
}

fun main() {
    println("Enter array size: ")
    var n:Int = readLine()!!.toInt()
    println("Enter start point of line segment: ")
    var a:Int = readLine()!!.toInt()
    println("Enter endpoint of line segment: ")
    var b:Int = readLine()!!.toInt()
    var arr = createArray(n, a, b)
    println("Generated array: ")
    printArray(arr)
    var compositeSum:Int = 0
    var compositeCounter:Int = 0
    for (i in 0..arr.size-1) {
        val sum: Int = arr[i].toString().sumOf { it - '0' }
        if (compositeCheck(sum)) {
            compositeSum += arr[i]
            compositeCounter += 1
        }
    }
    println("Sum of elements with composite sum of digits: $compositeSum")
    println("Number elements with composite sum of digits: $compositeCounter")
}