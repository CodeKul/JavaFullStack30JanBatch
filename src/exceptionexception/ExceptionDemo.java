package exceptionexception;

public class ExceptionDemo {
    public static void main(String[] args) {
        System.out.println(8/2);
        System.out.println(8/2);
        System.out.println(8/2);
        try {
            System.out.println(8/0);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        System.out.println(8/2);
        System.out.println(8/2);
        System.out.println(8/6);
    }
}
