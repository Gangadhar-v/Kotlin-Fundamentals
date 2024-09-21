package Condition

fun main() {
    var i=13
    var j=14
     var result=if(i>j){ "$i is greater than $j"}
    else if(i<j){"$i is less than $j"}
    else{
        "$i == $j"
    }
    println(result)
}