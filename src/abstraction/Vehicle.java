package abstraction;

public abstract class Vehicle {
    abstract void display();
    abstract void show();
}
class Car extends Vehicle{

     Car(){

    }

    @Override
    void display() {
        System.out.println("");
    }

    @Override
    void show() {
        System.out.println("in show");
    }
}
class VehicleImpl{
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.display();
    }
}
