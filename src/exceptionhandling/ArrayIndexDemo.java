package exceptionhandling;

public class ArrayIndexDemo {
    public static void main(String[] args) {
        int a[]  = new int[5];
        try {
            System.out.println("7");
            System.out.println("8");
            System.out.println("9");

            System.out.println(a[4]);
            System.out.println("1");
            System.out.println("2");
            System.out.println("3");

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        System.out.println("Remaining code");

    }
}
