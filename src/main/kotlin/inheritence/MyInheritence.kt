package inheritence

 open class Mobile() {
   open val name: String = ""
  open  val size: Int = 5

    fun makeCall() = println("calling from Mobile")
    fun powerOff() = println("Shutting down")
  open  fun display() = println("simple display")
}

class onePLus():Mobile() {
    override val name: String = "One Plus"
    override val size: Int = 6
    override fun display() {
        super.display()//prints the parent class
        println("overrided to ->onePlus display")//parent class is overrided
        //by default the return is "unit" value to those functions which do not have the return value

    }
}

    fun main() {
        val phone1 = Mobile()
        println(phone1.display())
        val phone2 = onePLus()
        println(phone2.display())
    }

