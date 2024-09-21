import fuctions.add

class caluculator(){
    fun add(a:Int,b:Int):Int{
        return a+b
    }
    fun multiply(a:Int,b:Int):Int{
        return a*b
    }
}

fun main() {
    val numbers=caluculator()
    println(numbers.add(2,45))
    println(numbers.multiply(4,56))
}