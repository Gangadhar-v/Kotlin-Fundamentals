package placmentTraining

import java.util.stream.Stream

/*
 input ->asdf#asd###
 output -> asdfasd

 */
fun clearHash(s:String) {

    val list = mutableListOf<Char>()
    for( i in s){
        if(i == '#'){
            continue
        }else{
            list.add(i)
        }
    }
    println(list.toString())
}

fun clearHash2(s:String):String{
    return s.replace(oldValue ="#",newValue="")
}
fun main() {
    println(clearHash2("asdf##jfls#"))
}