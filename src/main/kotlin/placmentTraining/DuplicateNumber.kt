package placmentTraining

fun findDuplicateNumber(arr:Array<Int>):Int{
    // floyd's algorithm is used to find the cycle or duplicates
    //initialize two pointers slow and fast, move one step slow and fast two steps ahead
    //the meeting point of this two pointers is duplicate value index
    var slow = arr[0]
    var fast = arr[0]

    do{
        slow = arr[slow]
        fast = arr[arr[fast]]
    }while(slow != fast)


    return fast
}
fun main() {
    println(findDuplicateNumber(arrayOf(1,3,4,2,4)))
}