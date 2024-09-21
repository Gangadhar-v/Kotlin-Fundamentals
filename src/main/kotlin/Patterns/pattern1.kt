package Patterns

fun main(n:Int) {
    for(rows in 1..n){      /*run outer for loop =number of rows */
        for(col in 1..rows){
            print(" *")
        }
        println()
    }
}
fun main() {
    var pattern1=main(4)
    println(pattern1 )
}
/*
1 *
2 * *
3 * * *
4 * * * *
*/