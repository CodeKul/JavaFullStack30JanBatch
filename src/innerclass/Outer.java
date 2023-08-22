package innerclass;
//Nested Inner class
public class Outer {
    class Inner{
        void display(){
            System.out.println("in Inner class");
        }
    }
}
class OuterDemo{
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner= outer.new Inner();
        inner.display();
        //Outer.Inner =
    }
}
