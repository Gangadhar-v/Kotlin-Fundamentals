package objects

//declaring obje ts inside the class
class Myclass{
    object MyObject {
        @JvmStatic//to call this object in java class
        fun f(){
            println("hello i am f from object")
        }
    }
    companion object Anotherobject{
        fun g(){
            println("hello i am g from Anotherobject")
        }
    }
}

fun main() {
    Myclass .MyObject .f()
    Myclass .g() //
}