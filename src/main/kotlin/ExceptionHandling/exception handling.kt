package ExceptionHandling

//try catch finally
fun main() {
    val arr= arrayOf(1,2,3)
    try{
       println( "the sizse of array is ${arr.size}")
       println( arr.get(0))
        println(arr.get(1))
        println(arr.get(2))
        println(arr.get(3))//arr[3]->get method
    }
    catch (g:Exception) {
        println("please check the array index")
    }
    finally{
        println("i will execute no matter what ever it is.")
    }
}