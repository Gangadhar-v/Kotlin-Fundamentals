package classes
//students of same section i,e is B
data class student(val stdName:String, val stdAge:Int,val stdUsn:Int, val stdSec:String) {
    init{
        println("welocome to section 'B'")
    }
    fun greetTheTeacher()=println("I am $stdName Guru Devoba")
    constructor(stdNameParam:String,stdAgeParam:Int,stdUsnParam:Int): this(stdNameParam, stdAgeParam, stdUsnParam,stdSec="B" )
}

fun main() {
    var std1=student("Gangadhar v",21,86)
    std1.greetTheTeacher()
    println(std1.stdName)
    println(std1.stdAge)
    println(std1.stdSec )
    println(std1.stdUsn )


}