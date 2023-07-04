package multithreading;

public class ThreadTest2 implements Runnable{
    

    @Override
    public void run() {
        System.out.println("in Thread 2");
    }

    public static void main(String[] args) {
        ThreadTest2 t1 = new ThreadTest2();
        Thread thread = new Thread(t1);
        thread.start();
    }

}
