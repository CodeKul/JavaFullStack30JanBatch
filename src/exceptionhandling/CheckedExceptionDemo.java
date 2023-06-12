package exceptionhandling;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CheckedExceptionDemo {
    public static void main(String[] args) {
//        System.out.println(10/0);
        try {
            PrintWriter printWriter = new PrintWriter("abc.txt");
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
