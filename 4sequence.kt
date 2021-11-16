fun main() {
    println("Enter separately each number of the sequence; enter '0' when the sequence ends.")
    var input:Int = readLine()!!.toInt()
    var sum:Int = 0
    while (input!=0) {
        val numbers =  readLine()!!.map { it.toString().toInt() }
        if (numbers[0] == 0) break
        numbers.forEach{
            if (it % 2 != 0) {
                sum += it
            }
        }
        input = readLine()!!.toInt() 
    }
    println("The sum is: $sum")
}