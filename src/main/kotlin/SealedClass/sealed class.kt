package SealedClass

//to overcome the disadvatage of enum class
sealed class tile
data class Red(val type:String,val points:Int):tile()
data class blue(val points:Int):tile()

fun main() {
    val tile1:tile =Red("mushroom",5)
    val tile2:tile=blue(9)
    }
