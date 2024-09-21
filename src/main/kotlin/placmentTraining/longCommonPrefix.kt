package placmentTraining


import kotlin.text.StringBuilder

// array have immutable string, and we can update the elements in it
fun longCommonPrefix(strings:Array<String>):String {

    //find the minimum string length in array of string
    val minLength = strings.minOf { it.length }
    val commonChars = StringBuilder()

    //iterate through each index up to minimum length
    //last minIndex = minLength - 1
    for(i in 0 until minLength){
        var currentChar = strings[0][i]

        if(strings.all { it[i] == currentChar}){
            commonChars.append(currentChar)
        }else{
            break
        }
    }
    return commonChars.toString()
}

fun main() {
//    val numArray = arrayOf<Int>(1, 2, 3)
//    numArray[1] = 10
//    val list = mutableListOf(1, 2, 3)
//    val arrayList = arrayListOf("1",1,3)
//    list[0] = 5
//    println()
    val string = "Gangadhar v"
    println(string.split(" "))

    }


