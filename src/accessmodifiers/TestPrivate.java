package accessmodifiers;

/**
 * only accessible within class,we cannot access from outside the class
 */
public class TestPrivate {
     private String msg = "Hello";
     private TestPrivate(){

     }
    private void getMsg(){
        System.out.println("in msg");
    }
}
class PrivateImpl{
    public static void main(String[] args) {
       // TestPrivate testPrivate = new TestPrivate(); //compile time
       // testPrivate.getMsg();//compile time

    }
}