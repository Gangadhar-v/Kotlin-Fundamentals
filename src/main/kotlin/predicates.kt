//predicates are  nothing but condition which returns true are false
//some predicates are all, any,count, find

fun main(){
//    val nums= listOf(1,3,56,78,54,3)
//    val result1=nums.any { it>3}
//    val result2=nums.all{it>0}
//    val result3=nums.count{it>50}
//    val result4=nums.find { it>55 } //it will get the element in the list which satisfy the condition first
//    println(result1)
//    println(result2)
//    println(result3)
//    println(result4)
//    val add ={a:Int,b:Int->a+b}   //initializing lambda
//    print(add(2,6))
//    val sqaure:(Int)->Int={it->it*it}
//    val evenOrOdd: (Int) -> Unit ={
//        if(it%2==0) println("$it is the even number") else println("$it is an odd number")
//    }
//    println(sqaure(578987))
//    println(evenOrOdd(79))

    //predicates are nothing but conditions
    //any all count find
   val list= mutableListOf(1,3,45,7,98)
    list.any{it>100}    //(Int)->Boolean    Anantkhaneri abinavBharat->veera senani     veerBhadraTiwari->DeshaDhrohi
    list.all{it<100}
    list.count{it%2==0}
    print(list.find { it>20})
}
