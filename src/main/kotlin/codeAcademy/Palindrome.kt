package codeAcademy

fun main() {
  val run = isPalindrome("racecar")
    println(run)
}

fun isPalindrome(string:String):Boolean{
    val size = string.length
    val lastIndex = size-1
    var reverseString = ""
    var result:Boolean? = null

    for( index in lastIndex downTo 0){
        reverseString = reverseString+string[index]
    }

    if(reverseString == string){
        result = true
    }else{
        result = false
    }

    return result
}



