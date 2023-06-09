package exceptionhandling;

public class NullPointerDemo {
    public static void main(String[] args) {
        String str = null;
        try {
            System.out.println(""+str.toLowerCase());
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
    }
}
