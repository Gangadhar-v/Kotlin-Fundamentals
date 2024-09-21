package practice

class AutoMobiles(val name:String,val tier:Int,val Maxseat:Int,
                  val engineType:String,val hasairBags:Boolean,
                  val color:String,val Comapany:String){/* proterties or primary constructors*/
    init{
        println(" TATA car design STRUCTURE")
    }
    //methods or fuctions
    fun applyBreaks()=println("breaks applied to car $name")
    fun onTheWiper()=println("wiper are working onthe car $name")
    fun howsTheCarColor()=println("the car color $color was mindblowing")
    constructor(name:String,Maxseat:Int,engineType:String,hasairBags:Boolean,color:String):this(name,4,Maxseat ,engineType
    ,hasairBags,color ,"TATA")
}

fun main() {
    val car1=AutoMobiles("NANO",4,"petrol",false,"blue")
    car1.let{
        println(it.name)
        println(it.Maxseat )
        println(it.engineType)
        println(it.hasairBags)
        println(it.color)
        println(it.Comapany)
        println(it.applyBreaks())
        println(it.howsTheCarColor())
        println(it.onTheWiper())
    }

}