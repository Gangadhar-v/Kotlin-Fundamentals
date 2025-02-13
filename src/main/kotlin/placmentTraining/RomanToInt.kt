package placmentTraining


fun romanToInt(s: String): Int {
    val size = s.length
    val romanMap = mapOf(
        'I' to 1,
        'V' to 5,
        'X' to 10,
        'L' to 50,
        'C' to 100,
        'D' to 500,
        'M' to 1000
    )

    var result = 0


    for (i in 0..size-1) {

        val current = romanMap[s[i]] ?: 0
        val next = if (i + 1 < size) romanMap[s[i + 1]] ?: 0 else 0
        if (current < next) {
            result -= current
        } else {

            result += current
        }
    }

    return result
}
fun main() {
    print("om")
}