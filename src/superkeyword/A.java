package superkeyword;

public class A {
    int no = 10;
}
class B extends A{
    int no = 20;
    void show(int no){
        System.out.println(no);
        System.out.println(this.no);
        System.out.println(super.no);
    }
}

class TestImpl{
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        b.show(30);

    }
}