package List

import java.lang.Error

var list= listOf(1,2,3,4,5,6)
fun main() {
    println(list.size)
    println(list[0])
    println(list[1])
    println(list[2])
    println(list[3])
    println(list.get(5))
    try{
        list.get(6)
    }
    catch(x:Exception){
        println("check the index of the list")
    }
    finally{
        class wish (var name:String){
            fun WelcomeWish(){
                println("$name welcome  to kotlin programming ")
            }
            init{
                println("this is welcome wish")
            }
        }
    }
}