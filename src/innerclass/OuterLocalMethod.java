package innerclass;

/**
 * 2. Method Local Inner class
 */
public class OuterLocalMethod {
    void outerMethod(){
        System.out.println("in outer method");
        class InnerLocalMethod {
            void innerMethod(){
                System.out.println("in inner method");

            }
        }
        InnerLocalMethod m2 = new InnerLocalMethod();
        m2.innerMethod();
    }
}

class OuterLocalImpl{
    public static void main(String[] args) {
        OuterLocalMethod outerLocalMethod = new OuterLocalMethod();
        outerLocalMethod.outerMethod();

    }
}