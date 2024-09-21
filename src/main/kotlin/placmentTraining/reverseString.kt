package placmentTraining

fun reverseString(str:String):String{
    val size = str.length
    var reverseString = ""
    for(char in size-1 downTo 0){
        reverseString = reverseString + str[char].toString()
    }
    return reverseString
}

fun reverseInt(x:Int):Int{
    val number = x.toString()
    val reversed = number.reversed()

    return reversed.toInt()
}
fun main() {
    println(reverseString("ganga"))
    println(reverseInt(123))
}