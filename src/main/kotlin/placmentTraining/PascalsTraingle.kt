package placmentTraining

fun generatePascalTraingle(numRows:Int):List<List<Int>>{
    val triangle = mutableListOf<List<Int>>()
    //generate number of rows
    for( row in 0 ..numRows-1){
        val newRow = mutableListOf<Int>()
        for(col in 0..row){
            if( col == 0 || col == row){
                newRow.add(1)
            }else{
                newRow.add(triangle[row-1][col-1] + triangle[row-1][col])
            }
        }
        triangle.add(newRow)
    }

    return triangle
}

fun getPascalTriangel(triangle:List<List<Int>>){
    for( i in triangle){
        println(i.joinToString(" "))
    }
}

fun main() {
   val triangle = generatePascalTraingle(5)
    getPascalTriangel(triangle)
}