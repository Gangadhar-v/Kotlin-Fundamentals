package placmentTraining


fun totalPaintingCost(M:Int,N:Int,SurfaceAreaOfWalls:FloatArray):Float{

    val costPerSqFtInterior = 20.0f
    val costPerSqFtExterior=15.0f
    var totalCost = 0.0f

    for( wall in 0 until M){
        totalCost = totalCost+SurfaceAreaOfWalls[wall]*costPerSqFtInterior
    }

    for( wall in M until N){
        totalCost = totalCost+SurfaceAreaOfWalls[wall]*costPerSqFtExterior
    }

    return totalCost
}

fun main() {
    val M = 6
    val N = 3
    val SurfaceAreaOfWalls = floatArrayOf(12.3f, 15.2f, 12.3f, 15.2f, 12.3f, 15.2f, 10.1f, 10.1f, 10.0f)

   // val totalCost = totalPaintingCost(M, N, SurfaceAreaOfWalls)
   // println(String.format("%.2f", totalCost))  // prints "2103.00"
    print(M)
}