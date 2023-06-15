package exceptionhandling;

import java.io.FileNotFoundException;

public class ExceptionPropagationDemo {
    void m1(){
       // System.out.println(10/0);
        throw new ArithmeticException("Exception occur");
       // throw new FileNotFoundException("");
    }

    void m2(){
        m1();
    }

    void m3(){
        try {
            m2();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        ExceptionPropagationDemo propagationDemo = new ExceptionPropagationDemo();
        propagationDemo.m3();
    }
}
