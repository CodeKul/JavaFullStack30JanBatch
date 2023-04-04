package thiskeyword;

/**
 * 1. to refer current class instance variable
 */
public class Car {
    int carId;
    String carName;
    String variant;

    Car(int carId,String carName,String variant){
        this.carId = carId;
        this.carName = carName;
        this.variant = variant;
    }

    void display(){
        System.out.println("Id "+carId);
        System.out.println("Name "+carName);
        System.out.println("Variant "+variant);
    }
}

class CarImpl{
    public static void main(String[] args) {
        Car car1 = new Car(1,"Brezza","Petrol");
        car1.display();

        Car car2 = new Car(2,"Innova","Diesel");
        car2.display();
    }
}