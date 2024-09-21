package NPTEL;


import java.util.ArrayList;
import java.util.Iterator;

//Iterator
public class InterfaceExample {
    public static void main(String[] args) {

        ArrayList<String > fruits = new ArrayList();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Guava");
        fruits.add("Grapes");

        Iterator iterator = fruits.iterator();
        while(iterator.hasNext()){
            String fruit = iterator.next().toString();
            System.out.println( "this is "+fruit);
        }
    }
}
