package common.controlflowstatements;

import java.util.Scanner;

public class PowerNoDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any no.");
        int no = sc.nextInt(); //2
        System.out.println("Enter power");
        int power = sc.nextInt(); //3
        int result = 1;
        while (power > 0){
            result = result * no;
            power--;
        }
        System.out.println("Result "+result);
        //2^3 = 2*2*2 = 8
    }
}
