package placmentTraining

fun validAnagram(s:String,t:String):Boolean{

    var charCount = IntArray(26)
    for( char in s){
        charCount[char-'a'] ++
    }
    for(char in t){
        charCount[char-'a'] --
    }
    for(i in charCount){
        if(i!=0)
            return false
    }
    return true
}

fun validAnagram2(s:String,t:String):Boolean{
    if(s.length != t.length)
        return false
    var charCount1 = IntArray(26)
    var charCount2 = IntArray(26)

    for(char in 0..s.length-1){
        charCount1[s[char]-'a']++
        charCount2[t[char]-'a']++
    }
    if(charCount1.contentEquals(charCount2))
        return true

    return false
}
fun main() {
    print(validAnagram("ab","a"))
}