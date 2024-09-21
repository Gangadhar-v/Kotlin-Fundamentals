package classes

//dataclass perpose is only to store the data
data class erson(val id:Int,val name:String)//no flower brackets to data class


fun main() {
    val p1= erson(86,"gangadhar v")
    println(p1)
    println(p1.id)
    println(p1.name)
    //copy function
    val p3=p1.copy(100,"katta")
    println(p3.id )
    println(p3.name )
    //distribution property
     val(id,name)=p3
    val p2= erson(92,"harshavardan")
    println(id)
    val(num,nama)=p2
    println(nama)
    println(num)
    //component enfunction
    println(p1.component1())
    println(p3.component1())
}