//getter are used to add values
//setters are used to make some rules for getter
class person(nameParam:String,ageParam:Int){
    var name:String=nameParam
        get(){
            return field.uppercase()
        }
    var age:Int=ageParam
        set(value)    {
            if(value>0){
               field =value//fied is a special veriable
            }
            else{
                println("age cannot be negative")
            }

        }
}

fun main() {
    var p1=person("Gangadhar v",21)

    println(p1.name )
    println(p1.age )
    var p2=person ("Sri S Venkatesh",48)
    println(p2.name )
    println(p2.age )

}