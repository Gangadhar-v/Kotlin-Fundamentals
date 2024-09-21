public class Vehicle {
    public void move() {
        System.out.println("vehicle  moves");
    }
}

class Car extends Vehicle{
    @Override
    public void move() {
        super.move();
    }
}
