package fuctions

//defaultParameters are always var type
fun printmessage(count:Int=108){
    for(i in 1..count){
       println("hello $i")
    }
}
fun main() {
    var count=printmessage(99)
    println(count)
}
