package Lambda
                   /*---------TECH GANG----------*/
/*LAMBDAS are anonymous functions*/
fun main(){
    val lambda={x:Int,y:Int->x+y}
    //written type of lambdas depends upon dataType last line
    val multiLineLambda={
        println("Namaste Bharat")
        "hello there kotlin devloper"//written type is String
    }
    val sqaure= lambda2 (3)
    println(sqaure)
    val result= evenOrOdd (689)
    println(result)
}
val lambda2:(Int)->Int={it->it*it}
val evenOrOdd: (Int) -> Unit ={
    if(it%2==0){
        println("$it is even number")//'it' is utility function, which points the current object
    }
    else {
        println("$it is odd number")
    }
}