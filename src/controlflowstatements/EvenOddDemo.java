package controlflowstatements;

import java.util.Scanner;

public class EvenOddDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any no");
        int no = sc.nextInt();
        System.out.println("no%2 ->"+no%2);
        if (no%2==0)
            System.out.println(no + " is Even no.");
        else
            System.out.println(no + " is Odd no.");

    }
}
