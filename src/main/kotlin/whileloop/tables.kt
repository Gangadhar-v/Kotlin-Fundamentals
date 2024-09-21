package whileloop

fun main() {
    var table:Int=2
    var count:Int=1
    while(count<=10){
        println("$table * $count = ${table*count}")
        count++
    }
}