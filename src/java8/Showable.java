package java8;

public interface Showable {
    void show();
   // void display();
    default void display(){
        System.out.println("in display method");
    }
}

class Test1 implements Showable{

    @Override
    public void show() {
        System.out.println("Test 1");
    }
}
class Test2 implements Showable{

    @Override
    public void show() {
        System.out.println("Test 2");
    }
}

class Test3 implements Showable{

    @Override
    public void show() {
        System.out.println("Test 3");
    }

    @Override
    public void display() {
        Showable.super.display();
    }
}