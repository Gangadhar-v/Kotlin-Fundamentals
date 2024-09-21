package NPTEL;

//protected access modifier can be access in only subclasses of it
class G{
    protected int i = 1000;
    public void print(){
        System.out.println("I am form A" +i);
    }
}
interface C{
    public static int j = 555;
    void printInterfaceC();
}
interface D{
    public static int k =666;
    void printInterfaceD();
}

class H extends G implements C,D{

    @Override
    public void printInterfaceC() {
        System.out.println("I am form C"+j);
    }

    @Override
    public void printInterfaceD() {
        System.out.println("I am form D"+k);
    }
    public void printH(){
        super.print();
        printInterfaceC();
        printInterfaceD();
    }
}
public class MultipleInheritance {
    public static void main(String[] args) {
        H h = new H();
        h.printH();
    }
}
//generation of random number Random random = Random()    random.nextDouble()
