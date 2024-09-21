package NPTEL;

interface I1{
    double x = 4.444;
    void methodI1();
}
interface I2 extends I1{
    double y=5.555;
    void methodI2();


}
//class A1 can access to the members of both interface I1 and I2
class A1 implements I2{

    @Override
    public void methodI1() {
        System.out.println("From I1" + x+y);
    }

    @Override
    public void methodI2() {
        System.out.println("From I2" + x+y);
    }
}
public class InterfaceDemonstration {
    public static void main(String args[]){
        A1 obj = new A1();
        obj.methodI1();
        obj.methodI2();
    }
}
