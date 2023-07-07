package multithreading;

class ThreadSleep extends Thread{
    @Override
    public void run() {
        for (int i = 1;i<=5;i++){
            try {
                System.out.println(Thread.currentThread()+" "+ 2*i);
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }
}

public class ThreadSleepDemo {
    public static void main(String[] args) {
        ThreadSleep t1 = new ThreadSleep();
        ThreadSleep t2 = new ThreadSleep();
        t1.start();
        t2.start();

        t1.start();
    }
}
