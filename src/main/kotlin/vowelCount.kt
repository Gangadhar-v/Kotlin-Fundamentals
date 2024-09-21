import java.util.Scanner

fun count(str:String):String {
    var vowelCount: Int = 0
    var consonentCount:Int = 0
    val newStr=str.toLowerCase()
    for(i in newStr){
        when(i){
           'a','e','i','o','u'-> {
               vowelCount+=1
           }
        else->consonentCount+=1

        }
    }
    return "vowels are $vowelCount, consonents are $consonentCount "
}
fun main() {
    val result=count("gangadhar.v")
    println(result)
}




fun vowelCount(string:String): String {
    var vowelCount=0
    var consonantCount=0
  for(i in string){
      val lowCase=i.toLowerCase()
      when(lowCase){
         'a','e','i','o','u'->{
              vowelCount+1
          }
          else ->consonantCount +1
      }

  }
    return "the vowel count is $vowelCount and the consonant count $consonantCount"
}