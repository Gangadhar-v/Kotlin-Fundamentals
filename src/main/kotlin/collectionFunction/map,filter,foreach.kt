package collectionFunction
                 /*---------TECH GANG----------*/
/*filter---map---foreach*/
fun main() {
    val nums= listOf(1,2,3,4,5,6,7)
    val swaras= listOf("sa","re","ga","ma","pa","da","ne")
    val result=nums.filter { a:Int ->a%2==0 }
    val result2=nums.filter{b:Int->b%2!=0}

    val result3=nums.map{i:Int->i*i}//to convert from 1 form to another
                     print("$result," +
                             "$result2," +
                             "$result3")
    nums.forEach() {//it is similar to for loop
        print(it)
    }

                     swaras.forEach() {
                         println("$it....")
                     }
}