package Maps.maps
                                                /*---------TECH GANG----------*/
/*MAPS are nothing but DICTIONARIES  */
fun main() {
    var dictionary= mapOf<Int,String>/*this is type inference*/(1 to "Shree Shankaracharya",2 to "Chatrapati Shivaji",3 to "Swamy Vivekananda"
    ,4 to "Veer Savarkar")
    for((i,e) in dictionary){
        println("$i -> $e")
    }
    var dic2= mutableMapOf<Double,Int>((0.0 to 1),1.0 to 2)
    dic2.set(2.0,3)
    for((i,e) in dic2){
        println("$i->$e")
    }
}