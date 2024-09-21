package Enum

enum class Days {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SAUTARDAY


}
class birthday(){
    init{
        println("Janmadin ka shubashay")
    }
    fun birthdayWish(name:String,date:Double,day:Days){
        var result=when(day){
            Days.SUNDAY ->"GO TO SURYA TEMPLE"
            Days.MONDAY ->"GO TO SHIVA TEMPLE"
            Days.TUESDAY ->"GO TO SUBRAMANYA TEMPLE"
            Days.WEDNESDAY ->"GO TO GANESHA TEMPLE"
            Days.THURSDAY ->"GO TO RAGHAVENDRA TEMPLE"
            Days.FRIDAY ->"GO TO KOLARAMMA TEMPLE"
            Days.SAUTARDAY ->"GO TO SANESHWARA TEMPLE"
            else->"day out of range"
        }
        println(result )
    }
}

fun main() {
    var p1=birthday()
    p1.birthdayWish("veer savarkar",28.5,Days.THURSDAY )

}