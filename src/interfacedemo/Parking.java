package interfacedemo;

public interface Parking {
    //marker interface
}
class TwoWheeler implements Parking{
    void ride(){
        System.out.println("in two wheeler");
    }
}

class FourWheeler{
    void drive(){
        System.out.println("in four wheeler");
    }
}

class ParkingImpl{
    public static void main(String[] args) {
        TwoWheeler twoWheeler= new TwoWheeler();
        FourWheeler fourWheeler= new FourWheeler();
        if (fourWheeler instanceof Parking){
            System.out.println("Allow");
        }
        else {
            System.out.println("Don't Allow");
        }
    }
}