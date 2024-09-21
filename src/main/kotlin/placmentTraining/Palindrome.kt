package placmentTraining



fun isPalindrome(number:Int):Boolean{

    var original = number
    var reverseNum =0
    var temp = number
    while(temp !=0) {
        var digit = temp % 10  //getting last digit
        reverseNum = reverseNum * 10 + digit
        temp = temp/10 //removing last digit
    }
    return reverseNum == original
}

fun main() {
    println(isPalindrome(12321))
}