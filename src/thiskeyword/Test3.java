package thiskeyword;

public class Test3 {
    void t1(){
        this.t2();
        System.out.println("t1 method");

    }
    void t2(){
        System.out.println("t2 method");
    }
}

class Test3Impl{
    public static void main(String[] args) {
        Test3 test3 = new Test3();
        test3.t1();
    }
}