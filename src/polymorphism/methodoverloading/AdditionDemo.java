package polymorphism.methodoverloading;

public class AdditionDemo {
    void add(int n1,int n2){
        System.out.println(n1+n2);
    }
    void add(int n1,float f1){
        System.out.println(n1+f1);
    }
    void add(float f1,int n1){
        System.out.println(f1+n1);
    }
    void add(int n1,int n2,int n3){
        System.out.println(n1+n2+n3);
    }
    void add(float f1,float f2){
        System.out.println(f1+f2);
    }
}
class AdditionImpl{
    public static void main(String[] args) {
        AdditionDemo additionDemo = new AdditionDemo();
        additionDemo.add(5,6);
        additionDemo.add(5.5f,6.0f);
        additionDemo.add(5,6.5f);
        additionDemo.add(5.5f,5);
        additionDemo.add(3,4,5);
    }
}
