package multithreading;

public class ThreadNamingDemo extends Thread{
    @Override
    public void run() {
        System.out.println("in run method");
    }
}

class ThreadNamingImpl{
    public static void main(String[] args) {
        ThreadNamingDemo t1 = new ThreadNamingDemo();
        ThreadNamingDemo t2 = new ThreadNamingDemo();
        System.out.println("Before Naming T1 "+t1.getName());
        System.out.println("Before Naming T2 "+t2.getName());

        t1.setName("T1");
        t2.setName("T2");


        System.out.println("After Naming T1: "+t1.getName());
        System.out.println("After Naming T2: "+t2.getName());
    }
}