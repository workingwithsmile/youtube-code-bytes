fun main() {
    val num = 153  // Change this to test other numbers
    var temp = num
    var digits = 0
    var sum = 0

    // Count digits
    while (temp > 0) {
        digits++
        temp /= 10
    }

    temp = num
    while (temp > 0) {
        val digit = temp % 10
        sum += Math.pow(digit.toDouble(), digits.toDouble()).toInt()
        temp /= 10
    }

    if (sum == num) {
        println("$num is an Armstrong number.")
    } else {
        println("$num is NOT an Armstrong number.")
    }
}
