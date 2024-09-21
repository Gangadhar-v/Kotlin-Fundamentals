package inheritence
//all company car belong to TATA company
 open class carStructure(nameP:String,tiersP:Int,seatsP:Int,hasAirBagsP:Boolean,companyP:String){ //parameters
    val name:String=nameP //properties
    val tiers:Int=tiersP // assigning parameters to properties
    val seats:Int=seatsP
    init{
       println( "TATA cars bluePrint")
    }
   open val hasAirBags:Boolean=hasAirBagsP
    val company:String=companyP
  open  fun itHasAirBags()=println("it has air bags $hasAirBags")
    constructor(nameParam:String,seatsParam: Int,hasAirBagsParam: Boolean):this(nameParam ,4,seatsParam,hasAirBagsParam ,"TATA")
}
class nano():carStructure ("nano",3,false,){
    init{
       println( "Details of car1")
    }
    override fun itHasAirBags() {
         super.itHasAirBags()
        println("TATA nano has no air bags")
    }
}

 class Nexon():carStructure ("nexon",4,true){
   init{
      println("Details of car2")
  }
}

fun main() {
    var car1=nano()
    println("car name ${car1.name}")
    println("number of car tiers ${car1.tiers}")
    println("the number of seats in the car ${car1.name} is ${car1.seats}")
    println("the car company ${car1.company}")
    println("does car has air bags:${car1.hasAirBags}")

  var car2=Nexon()
   println("car name ${car2.name}")
    println("number of car tiers ${car2.tiers}")
    println("the number of seats in the ${car2 .name} is ${car2.seats}")
    println("the car company ${car2.company}")
    println("does car has air bags:${car2.hasAirBags}")
}