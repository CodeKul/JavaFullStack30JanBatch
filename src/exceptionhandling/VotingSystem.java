package exceptionhandling;

public class VotingSystem {

    public static void main(String[] args) {
        int age = 10;

        if (age >= 18){
            System.out.println("You can vote");
        }else {
            throw new ArithmeticException("Not eligible for voting");
        }
    }
}
