package exceptionhandling;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowsDemo1 {
    void m1() throws FileNotFoundException{
        throw new FileNotFoundException("Invalid File");
    }

    void m2() throws FileNotFoundException{
        m1();
    }

    void m3()  {
        try {
            m2();
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        ThrowsDemo1 throwsDemo1 = new ThrowsDemo1();
        throwsDemo1.m3();
    }
}
