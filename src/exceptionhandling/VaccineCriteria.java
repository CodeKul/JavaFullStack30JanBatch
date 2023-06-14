package exceptionhandling;

import java.util.Scanner;

public class VaccineCriteria {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter your age ");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        if (age >= 55 && age <= 70){
            System.out.println("Applicable for vaccine");
        }else {
            try {
                throw new VaccineAgeCriteriaException("You are not applicable for vaccine");
            }catch (VaccineAgeCriteriaException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
