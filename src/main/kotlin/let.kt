fun check(num:Int){
    num.let {
       if( num%2==0)
        println("the number $it is even")
    }
//    else{
//        println("the number is not even")
//    }
}
fun main() {
    var num1=check(7)
    println(num1)
}