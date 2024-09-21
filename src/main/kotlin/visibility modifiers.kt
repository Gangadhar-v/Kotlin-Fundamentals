//visibility modifiers
//by default all variables are 'Public'
open class Person(name:String,age:Int,address:String){
  internal var nameParam:String=name
  private var ageParam:Int=age
   protected var addressParam:String=address

}

fun main() {
    var p1:Person=Person("Gangadhar v",21,"kolar")
    println(p1.nameParam )
//    println(p1.ageParam)//error due ageParam connot be accessed because it is privated
//    println(p1.addressParam)
    val t1=TaxDetails(99)
    t1.TaxAmount().tax()
}
class TaxDetails(val billAmount:Int){
    inner class TaxAmount{
        fun tax():Unit {
            val taxAmount = billAmount * .04
             println(taxAmount)
        }
    }
}
//Inner is key word used to class variable



