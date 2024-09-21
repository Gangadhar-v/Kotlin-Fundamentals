package placmentTraining


fun findRepeatingChar(word: String) :Char?{
    // when you want to exclude end value -> use until
    for(index in 0 until word.length-1){
        if(word[index] == word[index+1]){
            return word[index+1]
        }
    }
    return null
}
fun main() {
    println(findRepeatingChar("gogll"))
}