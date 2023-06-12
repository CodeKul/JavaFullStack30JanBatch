package exceptionhandling;

public class FinallyDemo2 {
    public static void main(String[] args) {
        String msg = null;
        try {
            System.out.println(msg.length());
        }finally {
            System.out.println("in finally");
        }
    }
}
