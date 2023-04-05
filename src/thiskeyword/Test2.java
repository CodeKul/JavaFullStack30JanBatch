package thiskeyword;

/**
 * 3. to invoke current class constructor
 */
public class Test2 {
    int no = 10;

    Test2(){
        this(5);
        System.out.println("in default constructor");
    }

    Test2(int no){
        this.no = no;
        System.out.println("No "+no);
    }
}

class Test2Impl{
    public static void main(String[] args) {
        Test2 test2 = new Test2();
    }
}