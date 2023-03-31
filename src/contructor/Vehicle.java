package contructor;

public class Vehicle {
    int vehicleId;
    String vehicleName;
    boolean isCar;

    Vehicle(){ //Default constructor
        System.out.println("in Default Vehicle object is created");
    }
    Vehicle(int id,String name){
        vehicleId = id;
        vehicleName = name;
    }

    Vehicle(int id,String name,boolean car){
        vehicleId = id;
        vehicleName = name;
        isCar = car;
    }


    void display(){
        System.out.println("Vehicle Id : "+vehicleId);
        System.out.println("Vehicle Name : "+vehicleName);
        System.out.println("isCar : "+isCar);
    }
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(1,"Bike");
        System.out.println("in main method");
        vehicle.display();

        Vehicle vehicle1 = new Vehicle(2,"Jazz",true);
        vehicle1.display();
    }
}
