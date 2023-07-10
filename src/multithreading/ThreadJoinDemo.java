package multithreading;

public class ThreadJoinDemo extends Thread{
    @Override
    public void run() {
        for (int i=0;i<3;i++){
//            try {
                System.out.println("i "+i +" "+Thread.currentThread());
//                Thread.sleep(300);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
        }
    }
}

class ThreadJoinImpl{
    public static void main(String[] args)  {
        ThreadJoinDemo t1 = new ThreadJoinDemo();
        ThreadJoinDemo t2 = new ThreadJoinDemo();
        t1.start();
        t2.start();
        System.out.println("Current: "+Thread.currentThread());

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}