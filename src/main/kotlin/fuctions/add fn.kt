package fuctions

//fun add(a:Int,b:Int):Int {
//    val sum =a+b
//    return sum
//}
fun EvenOrOdd(Num:Int){
    val check=if(Num % 2==0)"even" else "odd"
    println( check )
}
//inline function
fun check(num:Int)=if(num % 2==0 ) "even" else "odd"
fun add(a:Int,b:Int):Int=a+b
fun main() {
    val result=add(107,1)
    println(result)
    val result1= EvenOrOdd(32)
    println(result1)

}