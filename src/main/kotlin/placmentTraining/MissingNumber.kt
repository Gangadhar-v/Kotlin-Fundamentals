package placmentTraining

fun missingNum2(arr:Array<Int>){
    val max = arr.size
    for(i in 0 .. max){
        if(i !in arr){
            println(i)
        }
    }
}
fun missingNum(arr:Array<Int>):Int{
    val actualSum = arr.sum()
    val n = arr.size
    val expectedSum = n*(n+1)/2
    return expectedSum - actualSum

}

fun main() {
    val nums = arrayOf(0,1)
    missingNum2(nums)
}