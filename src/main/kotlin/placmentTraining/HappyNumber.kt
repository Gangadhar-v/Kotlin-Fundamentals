package placmentTraining

import kotlin.math.pow

fun isHappyNumber(n: Int): Boolean {
    var number = n

    while (number != 1) {
        var sum = 0
        for (i in number.toString()) {
            sum += i.toString().toInt() * i.toString().toInt()
        }
        if (sum == n) break
        number = sum

    }
    return number == 1
}

fun main() {
    println(isHappyNumber(20))
}