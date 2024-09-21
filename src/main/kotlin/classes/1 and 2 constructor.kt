package classes

class AutoMobile(val name :String , val tiers:Int,val MaxSeating:Int,val EnginType:String,val color:String) {/* primary constructor */
init {
    println("this is init block is called")
}
    fun applyBreaks()=println("breaks are applied to the car $name")/* inlinefuction */
    fun howsTheCarColor()=println("the $color color is beautiful")


    //intialising secondary constructor to fix some values in the primary constructors
    //in the taken example the tiers of all cars are fixed and every car as a maximum seat capasity of 5
    constructor(nameParam:String,engineParam:String,colorParam:String):this(nameParam,4,5,engineParam,colorParam )
    //tier and Maxseats are fixed to 4 and 5
}

fun main() {
    var car1=AutoMobile("TataNexon","petrol","yellow")//this way io creating objects for class
    var car2=AutoMobile("Inova","diesel","green")
    car1.applyBreaks()
    car2.applyBreaks()
    car1.howsTheCarColor()
    car2.howsTheCarColor()
    println(car1)
    println(car2)

}