import objects.A

/*
1) In a class 'this' refers to the 'current object' of the class
2) In extension function or lamdas 'this' refers to 'receiver parameter'
 */

class BankeDetails(private var balance:Float,var accountHolder:String){
    fun Deposite(Damount:Float ){
       this.balance+=Damount
        println("the balance after the deposite are: $balance")
    }
    fun withDraw(Wamount:Float){
        if(Wamount<this.balance){
            this.balance-=Wamount
            println("your bank balance after withdraw are: $balance")
        }
        else{
            println("insufficient bank balance $balance")
        }
    }
}

fun main() {
    var person=BankeDetails(100.0f,"kuberappa")
    person.Deposite(200.0f)
    person.withDraw(400.0f)
}

