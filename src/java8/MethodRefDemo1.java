package java8;
interface Bank{
    void getBankName(String bankName);
}
class Test{
    public static void getName(String name){
        System.out.println(name);
    }
}
public class MethodRefDemo1 {
    public static void main(String[] args) {
         Bank bank = (bankName) -> System.out.println(bankName);

         Bank bank1 = Test::getName;

    }
}
