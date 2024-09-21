//interface is  defining a set of bullet points,that should be included when it is taken as refference
interface image {//interface is by default open to inheritence
    var name:String
    var size:Double
    var height:Int
    var width:Int
    fun save()
}
class png:image{//polymorphism: taking parent reference to its child class
    override var name: String="coolpic"//inheritence
    override var size: Double=20.0
    override var height:Int=34
    override var width:Int=44
    override fun save() {
        println("image saved in firebase")
    }
}

fun main() {
    var img1:image=png()//taking parent as reference to child class
    println(img1 .name )
    println(img1 .size  )
    println(img1 .height)
    println(img1 .save())
}