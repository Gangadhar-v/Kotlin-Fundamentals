package Range

fun main() {
    var age=22
    var result=if(age in 18..100){"your eligible to vote" }//upper bound number is included
    else{
        "you are not eligible to vote"
    }
    println(result)

}