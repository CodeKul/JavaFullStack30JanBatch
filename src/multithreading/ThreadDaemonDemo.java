package multithreading;

public class ThreadDaemonDemo extends Thread{
    @Override
    public void run() {
        if (Thread.currentThread().isDaemon())
            System.out.println(Thread.currentThread()+" is daemon thread");
        else
            System.out.println(Thread.currentThread()+" is user thread");
    }
}
class ThreadDaemonImpl {
    public static void main(String[] args) {
        ThreadDaemonDemo t1 = new ThreadDaemonDemo();
        ThreadDaemonDemo t2 = new ThreadDaemonDemo();

        t1.start();
        t2.setDaemon(true);
        t2.start();
    }
}