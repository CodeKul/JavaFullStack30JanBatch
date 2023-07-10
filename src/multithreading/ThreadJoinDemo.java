package multithreading;

public class ThreadJoinDemo extends Thread{
    @Override
    public void run() {
        for (int i=0;i<3;i++){
            System.out.println("i: "+i);
            try {
                System.out.println("i for "+Thread.currentThread());
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class ThreadJoinImpl{
    public static void main(String[] args)  {
        ThreadJoinDemo t1 = new ThreadJoinDemo();
        ThreadJoinDemo t2 = new ThreadJoinDemo();
        t1.start();
        try {
            System.out.println("Current: "+Thread.currentThread());
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        t2.start();
        try {
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}