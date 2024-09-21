package placmentTraining

import kotlin.math.pow


fun checkArmStrong(n:Int):Boolean{
    val number = n.toString()
    val size = number.length
    var sum = 0
    for( i in number){
       val digit = i.toString().toDouble()
        sum = sum + digit.pow(size).toInt()
    }
    return sum == n
}
fun main() {
    println(checkArmStrong(153))
    println(checkArmStrong(9474))
    println(checkArmStrong(123))
}