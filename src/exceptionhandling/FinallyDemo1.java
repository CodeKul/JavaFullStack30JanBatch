package exceptionhandling;

public class FinallyDemo1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            System.out.println(a/b);
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("in finally block");
        }
        System.out.println("Remaining code");
    }
}
