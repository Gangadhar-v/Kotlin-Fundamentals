package codeAcademy

fun main() {

    val funcall = sayFizzBuzz(17)
    println(funcall)
}

fun sayFizzBuzz(value:Int):MutableList<Any>{
    val list = mutableListOf<Any>()

    for(number in 1..value){
        if(number%3 == 0){
            list.add("Fizz")
        }
        if(number%5 == 0){
            list.add("Buzz")
        }
        if(number%3==0 && number%5==0){
            list.add("FizzBuzz")
        }
        else{
            list.add(number)
        }
    }

return list
}