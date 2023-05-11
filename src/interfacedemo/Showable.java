package interfacedemo;

public interface Showable {
   void show();
}
class TestInterface implements Showable{
    @Override
    public void show() {
        System.out.println("in show method");
    }
}

class ShowableImpl{
    public static void main(String[] args) {
        Showable showable = new TestInterface();
        showable.show();
    }
}