package objects
                                       /*-------TECH GANG--------*/
import objects.sharingWidget.Fblikes
import objects.sharingWidget.Twitterlikes


//singleTon it is a class with only one object
object sharingWidget{
    var Twitterlikes:Int=0
    var Fblikes:Int=0
    fun IncrementTwitterlikes(){
        Twitterlikes ++//post increment
    }
    fun IncrementFblikes(){
        Fblikes ++
    }
}

fun main() {
    sharingWidget.IncrementFblikes()
    sharingWidget.IncrementFblikes()
    sharingWidget.IncrementFblikes()
    sharingWidget .IncrementTwitterlikes()
    sharingWidget .IncrementTwitterlikes()
    sharingWidget .IncrementTwitterlikes()
    sharingWidget .IncrementTwitterlikes()
    sharingWidget .IncrementTwitterlikes()
    println("twitterlikes--$Twitterlikes facebooklikes--$Fblikes")
}
