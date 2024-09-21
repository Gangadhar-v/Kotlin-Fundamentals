package placmentTraining

fun maxProfit(prices: IntArray): Int {
    val minIndex = prices.indices.minByOrNull { prices[it] }
    var sellingPrices = mutableListOf<Int>()
    val size = prices.size


    if (minIndex != null) {
        for(i in minIndex+1 ..size-1){

            sellingPrices.add(prices[i])
        }
        val stockSellingDay = sellingPrices.max()
        if(sellingPrices.size == 1){
            return prices[size-1]
        }
        return prices.indexOf(stockSellingDay) + 1
    }


return 0
}

fun main() {
    val prices = intArrayOf(7,1,5,3,6,4)
    println(maxProfit(prices))
}