package placmentTraining

fun MajorityElement(nums:IntArray):Int{
    val map = mutableMapOf<Int,Int>()  //val cannot be reassignable

    for(element in nums){

        if(map.containsKey(element)){
            map[element] = map[element]!! + 1
        }else{
            map.put(element,1)
        }
    }

    var maxEntry = map.entries.first()
    for(entry in map.entries){
        if(entry.value > maxEntry.value){
            maxEntry = entry
        }
    }
    return maxEntry.key
}

//using moore's majority algorithm
fun MajorityElement2(nums:IntArray){
    var count = 0
    var ans = 0
    for(item in nums){
        if(count == 0){
            ans = item
            count = 1
        }else{
            if(item == ans){
                count++
            }else{
                count --
            }
        }
    }
}
fun main() {
    val  nums = intArrayOf(1,2,4,4,4,2,2,2,2)
    print(MajorityElement(nums).toString())
}