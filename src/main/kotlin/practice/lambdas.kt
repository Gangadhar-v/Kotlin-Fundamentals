package practice

import fuctions.add

//lambdas are function without name

val addnums:(Int,Int)->Int={ num1,num2->
   num1+num2
}

//Higher order function which accepts argument as function or return function, or both
fun calculateSum(x:Int,y:Int,lamb:(Int,Int)->Int):Int{

  val result = lamb(x,y)
    return result
}
fun main() {
    val a=calculateSum(2,98, addnums)
    println("the sum is $a")
    val b=trickOrTreat(true,coin)
    b()
    val c = trickOrTreat(false,null)
    c()
    val d = trickOrTreat(true){ //trailing lambda syntax
        cupCake(3)
    }
    repeat(5){
        c()
    }
}
//lambda with return type Unit
val trick={
    println("No treat")
}
val treat={
    println("Have a treat")
}

//to make string nullable
fun trickOrTreat(isTrick:Boolean,extraTreat:((Int)->String)?):()->Unit{
    if(isTrick){
        return trick
    }
    else{
        if (extraTreat != null){
            println(extraTreat(5))
        }
    }
    return treat
}
//lambdas takes parameters(types only)
val coin:(Int)->String={ it->
    "$it quarters"
}
val cupCake:(Int)->String={
    "have a cup cake"
}
//datatype of variable or parameter click ctrl+q

//we can use trailing lambda syntax
//lambda expression return the value of the last expression

//repeat higher order function repeat(times:Int,action:(Int)->Unit)

//times represent how many times the action function repeat
//action Int parameter refers the number of times that the action has executed so far

