package Nullability
                                    /*--------TECH GANG---------*/
enum class Gender{
    male,female,transgender;
}
class uppercase {
    fun main(name:String,gender:Gender?) {
       if(gender!=null){
           println("our gender is $this")
           println("our gender is $gender")
       }
        gender?.let {//'let' uses in the place of more 'if' condition
            println("line1")
            println("line2 $gender")
            println("line $it")
        }
    }
}

fun main() {
    val p1=uppercase()
    val result=p1.main("",null )
    println(result)
    val p2=uppercase()
    val result1=p2.main("TECH GANG",Gender.male )
}
