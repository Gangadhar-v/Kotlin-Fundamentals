package Polimorphism
//parents can hold refference to its child class
open class Shape{
   open fun area():Double{
        return 0.0
    }
}
class Circle(val radius:Double):Shape(){//a way of defining inheritence with polimorphism
    override fun area():Double{
        return Math.PI*radius*radius
    }
}
class Square(val side:Double):Shape(){
    override fun area():Double{
        return side*side
    }
}
class Triangle(val base:Double,val height:Double):Shape(){
   override fun area():Double{
       return 0.5*base*height
   }
}
fun main() {
    //val circle:Circle=Circle(3.0)//explicity calling class
    val square:Square= Square(5.0)//child refference
    val circle:Shape=Circle(4.0)//parent refference
    println(circle.area())
    println(square.area())
    val shapes:Array<Shape> =arrayOf(Circle(6.0),Circle(0.02),Triangle (7.0,8.0))

    val triangle :Shape =Triangle (56.78,34.12)
    println(triangle.area()

    )

}
fun caluculateArea(shapes:Array<Shape>){
    for(shape:Shape  in shapes){
        println(shape.area())
    }

}
