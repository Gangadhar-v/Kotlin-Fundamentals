package fuctions

//If a function does not return a useful value, its return type is Unit. Unit is a type with only one value - Unit. This value does not have to be returned explicitly:

fun printNamaste(name:String?):Unit {
    if(name!=null){
        println("Namaste $name")
    }
    else{
        println("Namaste there!")
    }
}
fun main() {
    var greeting= printNamaste(null)
    val greeting1= printNamaste ("Yogi Adityanathji")
}