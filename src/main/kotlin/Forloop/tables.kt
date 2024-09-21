package Forloop

fun tableNumber(){
    for(i in 1..10 ){
        for(j in 1..10){
            println("$i x $j = ${i*j}")
        }
        println("----------*--------------")
    }
}
fun main() {
    var table= tableNumber()
    println(table)
}