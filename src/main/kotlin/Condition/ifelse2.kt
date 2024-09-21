package Condition

fun checkFreedomYear( year:Int) {

   var result= if (year==1947){
        println("happy independence day")
    }
    else if(year>2000){
        println("independence year is gone")

    }
    else{
        println("the independence year yet to come")
    }
    return result
}
fun main() {
    var result= checkFreedomYear(2023)
    println(result)
}