package fuctions
                                            /*---------- TECH GANG----------*/
/* HIGHER ORDER FUNCTIONS are the function which accept argument as function and returns the function */
fun Sum(a:Double,b:Double):Double{
    return a+b
}
fun calculator(a:Double ,b: Double ,fn:(Double ,Double )->Double):Double{
    val result=fn(a,b)
    return result
}
fun main() {
    val sum = Sum(1.0, 2.0)

    println(sum)
    val sum2= calculator(10.0,45.987,::Sum) //Sum is similar to 'fn', which was declared in calculator
    println(sum2)
}