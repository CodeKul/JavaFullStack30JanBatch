package polymorphism.methodoverloading;

public class A {
    void test(){
        System.out.println("in A");
    }
}
class B extends A{
    @Override
    void test(){
        System.out.println("in B");
    }
    public static void main(String[] args) {
        B b = new B();
        b.test();
    }
}
