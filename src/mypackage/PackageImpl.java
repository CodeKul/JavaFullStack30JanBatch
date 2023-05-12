package mypackage;

import mypackage.p1.A;
import mypackage.p1.B;

public class PackageImpl {
    public static void main(String[] args) {
        A a = new A();
        a.show();

        B b = new B();
        b.show();

        mypackage.p2.B b1 = new mypackage.p2.B();
        b1.show();
    }
}
