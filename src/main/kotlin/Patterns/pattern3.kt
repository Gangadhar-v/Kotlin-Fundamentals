package Patterns

/*
     *
    * *
   * * *
  * * * *
 * * * * *
 */
fun main() {
    for(row in 1..5){
        for(space in 5 downTo row){
            print(" ")
        }
        for(col in 1..row){
            print(" *")
        }
        println()
    }
}