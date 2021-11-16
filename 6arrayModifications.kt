fun createArray(n:Int, a:Int, b:Int): IntArray {
    var arr = IntArray(n)
    for (i in 0..n-1) {
        arr[i] = (a..b).random()
    }
    return arr
}

fun printArray(arr:IntArray) {
    println(arr.joinToString())
    //for (i in 0..arr.size-1) println(arr[i])
}

fun minPowerOf3(arr:IntArray): Int {
    var min:Int = 0
    for (el in arr) {
        if (el > 0 && el % 3 == 0) 
            if (el < min || min == 0) {
                var tempPow = 3
                while (tempPow <= el) {
                    if (tempPow == el) min = el
                    tempPow *= 3
                }
            }
    }
    return min
}

fun reverseNum(number: Int): Int {
    var number = number
    var reverse = 0
    while (number != 0) {
        reverse = reverse * 10 + number % 10
        number = number / 10
    }
    return reverse
}

fun reverseNumsWithout5(arr: IntArray): IntArray{
     for (i in 0..arr.size-1) {
        if ('5' !in arr[i].toString()) {
            arr[i] = reverseNum(arr[i])
        }
    }
    return arr
}

fun main() {
    var arr = createArray(100, -5, 50)
    println("Generated array: ")
    printArray(arr)
    var min = minPowerOf3(arr)
    println("Minimal power of 3 in array: $min")
    reverseNumsWithout5(arr)
    println("Array after reverse: ")
    println(arr.joinToString())
    arr.sort()
    println("Array after sort: ")
    println(arr.joinToString())
}