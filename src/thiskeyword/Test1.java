package thiskeyword;

/**
 * 2. to invoke current class method
 */
public class Test1 {
    void t1(){
        System.out.println("in t1");
    }

    void t2(){
        System.out.println("in t2");
        //this.t1();
        t1();
    }
}

class TestImpl{
    public static void main(String[] args) {
        Test1 test1 = new Test1();
        test1.t2();
    }
}