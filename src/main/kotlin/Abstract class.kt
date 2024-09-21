
//abstract class is always open to inheritence
abstract class shape(){
    val name:String=""
   abstract fun area():Double//incomplete function can writen as abstract
   open fun display(){
       println("shape is getting displayed")
   }

}