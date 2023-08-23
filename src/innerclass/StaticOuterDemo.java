package innerclass;

public class StaticOuterDemo {
   static String msg = "OUTER";
   static class StaticInner{
        void show(){
            System.out.println("msg: "+msg);
        }
    }
}

class StaticOuterImpl{
    public static void main(String[] args) {
        StaticOuterDemo.StaticInner staticInner = new StaticOuterDemo.StaticInner();
        staticInner.show();
    }
}
