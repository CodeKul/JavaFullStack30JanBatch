package exceptionhandling;

public class MultipleCatchDemo {
    public static void main(String[] args) {
        int a[] = new int[5];

        try {
            String msg = null;
            System.out.println(msg.toLowerCase());
            System.out.println(10/0);
            System.out.println(a[5]);
        }
        catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("Remaining code");
    }
}
