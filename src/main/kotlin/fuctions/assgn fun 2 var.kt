package fuctions

fun modulus(a:Int, b:Int)=println(a%b)//inline function

fun main() {
    var fn=::modulus
            fn(100,9)
    println("the remainder is $fn")
}