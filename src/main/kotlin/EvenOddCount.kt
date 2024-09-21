fun main() {
    var result=Count()
    var arr=arrayOf(1,2,3,4,5,6,7,8,9)
    result.EvenOrOddCount(arr)
    println(result)
}
class Count{
    fun EvenOrOddCount(array: Array <Int> ){
        var evencount:Int=0
        var oddcount:Int=0
        for(i in array){
            if(i%2==0){
                evencount ++
            }
            else{
                oddcount ++
            }
        }
        println("the total number of even numbers are $evencount ")
        println("the total number of odd number are $oddcount ")
    }
}