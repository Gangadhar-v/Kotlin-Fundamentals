package List

fun main() {
    var list = mutableListOf(1, 2, 3, 4, 5, 6)
    println("${list.get(0)} is zero th index ")
    list.set(0,10)
    //list.get(0)
    println("${list.get(0)} is zero th index ")//string concatenation
    println("${list.get(1)} is one th index ")
    println("${list.get(2)} is two th index ")
    println("${list.get(3)} is three th index ")
    try{
        list[6]
    }
    catch(x:Exception){
        println("check the index number of the list")
    }
    finally {
        println("i will execute what ever the is exception ")
    }
}