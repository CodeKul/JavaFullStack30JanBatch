package multithreading;

public class ThreadRunDemo extends Thread{
    @Override
    public void run() {
        System.out.println("Current Thread "+Thread.currentThread());
    }

    public static void main(String[] args) {
        ThreadRunDemo t1 = new ThreadRunDemo();
        t1.start();
    }
}
