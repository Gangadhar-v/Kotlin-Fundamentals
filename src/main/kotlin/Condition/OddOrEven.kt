package Condition

fun CheckOddOrEven(num:Int) :Unit{
   var result= if(num%2==0){
        "the number $num is even"
   }
    else{
        "the number$num is odd"
    }
    return
}
fun main() {
    var result= CheckOddOrEven(1883)
    println(result)
}