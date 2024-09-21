package Patterns

fun main() {
    //run outer for loop=number of rows
    for(rows in 1..5){
         for(col in 5 downTo rows){
             print(" *")
         }
        println()
    }
}
/*

*****   1r
****    2r
***     3r
**      4r
*       5r

 */