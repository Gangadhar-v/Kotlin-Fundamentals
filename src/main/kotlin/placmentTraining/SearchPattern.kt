package placmentTraining

fun searchPattern(string :String, pattern:String):List<Int> {

    val regex = Regex(pattern)
    val matches = regex.findAll(string)
    return matches.map{ it.range.first}.toList()  // map function is to transform

    //MatchResult.range
}
// abbcdefgabbcd  0 8
fun main() {
    println(searchPattern("abblasdfkjabb", "abb"))
}