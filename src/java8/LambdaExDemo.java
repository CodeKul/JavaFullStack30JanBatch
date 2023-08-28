package java8;
@FunctionalInterface
interface Vehicle{
    Boolean isVehicle(String vehicleType);
    default String getMediaPlayer(){
        return "Sony";
    }
    static String getEngine(){
        return "BS6";
    }
}
//class Car implements Vehicle{
//
//    @Override
//    public Boolean isVehicle() {
//        return true;
//    }
//}
public class LambdaExDemo {
    public static void main(String[] args) {
//        Vehicle vehicle = new Car();
//        vehicle.isVehicle();


        // lambda

        Vehicle vehicle1 = (vehicleType) -> {
            if (vehicleType.equals("CAR") )
            return true;
            else
                return false;
        };
        vehicle1.isVehicle("CAR");

        vehicle1.getMediaPlayer();
    }
}
