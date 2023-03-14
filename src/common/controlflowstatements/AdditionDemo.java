package common.controlflowstatements;

import java.util.Scanner;

public class AdditionDemo {
    public static void main(String[] args) {
        int ch;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter 1st no");
            int x = sc.nextInt();
            System.out.println("Enter 2nd no");
            int y = sc.nextInt();
            System.out.println("1.Addition");
            System.out.println("2.Subtraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
            System.out.println("5.Exit");
            System.out.println("Enter your choice");
            ch = sc.nextInt();
            int result = 0;
            switch (ch){
                case 1:
                    result = x+y;
                    System.out.println("Addition: "+result);
                    break;
                case 2:
                    result = x-y;
                    System.out.println("Subtraction: "+result);
                    break;
                case 3:
                    result = x*y;
                    System.out.println("Multiplication: "+result);
                    break;
                case 4:
                    result=x/y;
                    System.out.println("Division: "+result);
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong Choice!!!!");
            }
        }while (ch<=5);
    }
}
