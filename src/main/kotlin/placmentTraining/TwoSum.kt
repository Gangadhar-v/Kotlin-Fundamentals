package placmentTraining

//o(n**2)
fun twoSum(nums:List<Int>,target:Int): IntArray? {

    val result = IntArray(2)
    for (i in 0 until nums.size) {
        for (j in i + 1 ..nums.size-1){
            if(nums[i]+nums[j] == target){
                result[0] = i
                result[1] = j
                return result
            }
        }
    }
    return null //return null when no matches found
}

fun TwoSum2(nums:Array<Int>,target:Int):Array<Int>?{
    val map = HashMap<Int,Int>()

    for(i in nums.indices){
        val complement = target - nums[i]
        if( map.containsKey(complement)){
            return arrayOf(map.get(complement)!!,i)
        }else{
            map.put(nums[i],i)
        }
    }
    return null
}

fun main() {
    val nums = arrayOf(2, 7, 11, 15)
    val target = 9
    val result = TwoSum2(nums, target)

    if (result != null) {
        println("Indices: ${result.contentToString()}")
    } else {
        println("No two elements add up to $target")
    }
}