package controlflowstatements;

import java.util.Scanner;

public class PrimeNoDemo {
    public static void main(String[] args) {
        Boolean flag = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any no");
        int no = sc.nextInt();
        for (int i = 2;i<no/2;i++) {
            if (no % i == 0) {
                System.out.println(no + " is not prime number");
                flag = false;
                break;
            }

        }
        if (flag){
            System.out.println(no + " is  prime number");

        }
    }
}
