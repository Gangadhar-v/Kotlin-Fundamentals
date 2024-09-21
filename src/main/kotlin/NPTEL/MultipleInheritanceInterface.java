package NPTEL;

interface A{
      double a=5.94;
    void msgA();
}
interface B{
    double b=8.94;
    void msgB();
}
//item class can access both members form interface A and B, because it implemented that interface
class Item implements A,B{

    public int aValue = 999;
    @Override
    public void msgA() {
        System.out.println("this is from interface A"+a+b);
    }

    @Override
    public void msgB() {
        System.out.println("this is from interface B"+a+b);
    }

    public void printA(){
        System.out.println("I am form A" + (aValue= (int) (a+b)));
    }
}
public class MultipleInheritanceInterface {
    public static void main(String[] args) {
        Item obj = new Item();
        obj.msgA();
        obj.msgB();
        obj.printA();
    }
}
