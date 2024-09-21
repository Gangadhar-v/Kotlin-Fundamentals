package DataClass

 class RegularApi(val url:String,val apiKey:String,val q:String){
}
data class DataApi(val url:String,val apiKey:String,val q:String)
//data class have a property of distribution and component function

fun main() {
    val apicall=RegularApi ("https://","apapapjshdkjhfd","google")
    val dataApi=DataApi ("https://","bharat mathaki jai","firefox")
    println(dataApi )
    println(apicall)
    //distribution property
    val(a,b,c)=dataApi
    println(a)
    println(b)
    println(c)
    println(dataApi .component1())
    println(dataApi .component2())
    println(dataApi .component3())
}

