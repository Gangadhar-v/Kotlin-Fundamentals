package codeAcademy


fun caesar_cipher(string:String,shift:Int){

    for( char in string){
        if(char ==' '){
            continue
        }
        val ascii_value = char.toInt()+1
        print(ascii_value.toChar())
    }

}

open class Parent{
   open val name = "parent"
   open fun message():String{
        return "from parent"
    }
}
class Child:Parent(){
    override val name: String = "child"
    override fun message(): String {
        return "from child"
    }

}

fun main() {
    val p:Parent = Child()
    println("${p.name} ${p.message()}")
}


