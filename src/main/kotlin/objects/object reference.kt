package objects
//Anonymous class
interface clonable{
    fun clone(){
        println("clonning")
    }
}
 open class work{//default constructor
 open var walk:String=""
open fun workdone(){
    println("work done equals to force 8 displacement")
}
}

fun main() {
    var obl=object:clonable {//interface referring to object
        override fun clone() {
             super.clone()
            println("overrided clonr function")
        }
    }
   var obj2=object:work(){//class referring to object
       override var walk:String="I am walking"
       override fun workdone() {
            super.workdone()
           println("mass * velocity * displacement")
       }
    }
}