package java8;
interface Car{
    String showDetails();
}
public class InstanceMethodReferenceImpl {
    String displayDetails(){
        return "Car Details";
    }

    public static void main(String[] args) {
        InstanceMethodReferenceImpl reference = new InstanceMethodReferenceImpl();
        Car car = reference::displayDetails;
        System.out.println(car.showDetails());

        Car car1 = "codekul"::toUpperCase;
        System.out.println(car1.showDetails());
    }
}
