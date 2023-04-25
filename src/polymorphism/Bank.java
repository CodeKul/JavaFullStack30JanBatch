package polymorphism;

public class Bank {
    float getInterestRate(){
        return 0;
    }
}

class SBI extends Bank{
    @Override
    float getInterestRate() {
        return 8;
    }
}

class HDFC extends Bank{
    @Override
    float getInterestRate() {
        return 9;
    }
}
class BankImpl{
    public static void main(String[] args) {
        Bank bank1 = new SBI();
        System.out.println("SBI RI "+bank1.getInterestRate());

        Bank bank2 = new HDFC();
        System.out.println("HDFC RI "+bank2.getInterestRate());
    }
}