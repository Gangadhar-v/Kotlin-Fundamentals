package NPTEL;

class Animal{
    public void makeSound(){
        System.out.println("Make Some Genetic Sound");
    }
}

class Dog extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Woof");
    }
}

class Cat extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}



public class AccessModifier {
    public static void main(String args[]){
        Dog dog1 = new Dog();
        dog1.makeSound();

        Cat cat1 = new Cat();
        cat1.makeSound();
    }
}

//always reduce the restriction in overriding
/* i.e; private -> default -> protected -> public */
/*

when private -> reduce restriction i.e; use default protected public or private
when public -> we cant reduce public because it is a least weak access modifier
 */
