package polymorphism.methodoverloading;

public class A {
    int n = 10;
    void test(){
        System.out.println("in A");
    }
}
class B extends A{
    int n = 20;
    @Override
    void test(){
        System.out.println("in B ");
    }
    public static void main(String[] args) {
        B b = new B();
        System.out.println("B.n "+b.n);
        b.test();
    }
}
