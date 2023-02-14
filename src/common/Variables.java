package common;

/**
 * Types of Variables
 *  1. local variable --> variables declared inside method body
 *  2. instance variable --> variables declared inside class but outside the method body
 *  3. static variable --> cannot be local,share among all the instance of class, memory allocation
 *                          happens only once when the class loaded in memory
 *
 */

public class Variables {
    int b = 50; // instance variable
    static int c = 70;
    void display(){
        int a = 10;
        System.out.println(a);
    }

    public static void main(String[] args) {
        int d = 30;
        System.out.println(d);
    }
}
