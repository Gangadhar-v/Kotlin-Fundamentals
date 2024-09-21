package Arrays

//Arrays are with same dataType and with index number
fun main() {
    var arr= arrayOf("one","Two","Three")
    var arr2=arrayOf(1,2,3)
    //explicit declaration of array
    var arr3=arrayOf<Int>(5,6,7)
    for((i:Int,e:String) in arr.withIndex() ){
        println("$i -> $e")
    }
}