package objects
object A{
    var num:Int=21
}
object B{
    val g:Int=29
    fun test(){
        println("I am object $this")//this refferes the variable which is before to it
    }
}

fun main() {
    println(A.num)
    println(B.hashCode() )//it is from Any super class which was superclass of all class
    println(B.toString() )
    println(B.test() )

}