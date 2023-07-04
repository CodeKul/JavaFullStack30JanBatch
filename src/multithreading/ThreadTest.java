package multithreading;

public class ThreadTest extends Thread{

    @Override
    public void run() {
        System.out.println("Thread is running");
    }

    public static void main(String[] args) {
        ThreadTest t1 = new ThreadTest();
        t1.start();
    }
}
