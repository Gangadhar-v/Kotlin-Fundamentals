import java.lang.StringBuilder
import java.util.Scanner
fun main() {
//    val scanner=Scanner(System.`in` )//val= constant var =variable
//    println("Enter the word:")
//    val word=scanner.nextLine()
//    val reverseWord=StringBuilder(word).reverse()
//    println("the reverse of the word:$reverseWord ")
val university=University("R V COLLEGE")
    university.apply {
        canteen()
        playGround()
    }
val cmrUniversity=CmrUniversity()
cmrUniversity.apply {
    canteen()
    playGround()
}

}


open class University(nameP:String){
   open val name=nameP

   open fun canteen(){
        println("6 floors canteen in $name")
    }
   open fun playGround(){
        println("big cricket play in $name")
    }
}

class CmrUniversity:University("CMR UNIVERSITY"){
    override val name: String
        get() = super.name

    override fun canteen() {
        super.canteen()
        println("2 floor canteen $name")
    }

    override fun playGround() {
        super.playGround()
        println("no playGround in $name")
    }

}