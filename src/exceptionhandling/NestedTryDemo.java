package exceptionhandling;

public class NestedTryDemo {
    public static void main(String[] args) {
        String msg = null;
        try {
            try {
                System.out.println(msg.toUpperCase());
            }catch (NullPointerException e){
                System.out.println("inner catch "+e.getMessage());
            }
            System.out.println(10/0);
        }catch (ArithmeticException e){
            System.out.println("outer catch "+e.getMessage());
        }

        System.out.println("Remaining code");
    }
}
