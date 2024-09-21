package classes

class car(val name:String, val type:String, val KmRn:Int ,val color:String) {
    fun carRating(stars:Int){
        val stars=when(stars){
            1->"the car $name looking bad"
            2->"the car $name looking ok"
            3->"the car $name looking better"
            4->"the car $name looking amazing"
            5->"the car $name loking findBlowing"
            else->"out of ranging the star"


        }
        println(stars)
    }
    fun carColour()=println("the car color is $color")
    fun applyBreaks()=println("breaks are appied to $name")
    fun driveCar()=println("$name is driving")
}

fun main() {
    val car1=car("TATAindica","petrol", 90,"white")
    val car2=car("TATA Nexon","diesel",100,"black")
    println(car1.name)
    car1.carColour()
    car1.applyBreaks()
    car2.carRating(4)

}