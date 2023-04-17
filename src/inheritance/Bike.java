package inheritance;

public class Bike {
    public Bike(){
        System.out.println("in Bike class");
    }
    void vehicleType(){
        System.out.println("Bike");
    }
}
class RoyalEnfield extends Bike{
    public RoyalEnfield(){
        System.out.println("in RoyalEnfield class");
    }
    void brand(){
        System.out.println("Brand: RoyalEnfield");
    }
}

class Himalaya extends RoyalEnfield{
    public Himalaya(){
        System.out.println("in Himalaya class ");
    }

    void speed(){
        System.out.println("Speed: 120kmph");
    }
}

class BikeImpl{
    public static void main(String[] args) {
        Himalaya himalaya = new Himalaya();
        himalaya.vehicleType();
        himalaya.brand();
        himalaya.speed();
    }
}