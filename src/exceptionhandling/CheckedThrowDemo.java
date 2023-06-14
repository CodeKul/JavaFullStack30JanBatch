package exceptionhandling;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CheckedThrowDemo {

    static void  createFile() throws FileNotFoundException{
        PrintWriter printWriter = new PrintWriter("abc.txt");
        throw  new FileNotFoundException();
    }
    public static void main(String[] args) {
       try {
           createFile();
       }catch (Exception e){
           System.out.println(e.getMessage());
       }
    }
}
