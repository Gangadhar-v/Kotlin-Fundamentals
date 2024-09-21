package NPTEL;

abstract class Shape{
    static final double PI = 3.141492;
   abstract void area(int radius);
}

class Circle extends Shape{



    @Override
   void area(int radius) {
        System.out.println("the area of the circle is " + PI*radius*radius);
    }
}
public class AbstractImp {
    public static void main(String[] args) {
        Circle obj = new Circle();
        obj.area(5);
    }
}
