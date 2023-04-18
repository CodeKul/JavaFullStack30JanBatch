package inheritance;

public class A {
    void show(){
        System.out.println("in show");
    }
}

class B {
    void show(){
        System.out.println("in show");
    }
}
//class C extends B,A{ //compile error
//    public static void main(String[] args) {
//        C c = new C();
//        c.show();
//    }
//}