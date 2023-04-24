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
        SBI sbi = new SBI();
        System.out.println("SBI RI "+sbi.getInterestRate());

        HDFC hdfc = new HDFC();
        System.out.println("HDFC RI "+hdfc.getInterestRate());
    }
}