package multithreading;

import java.util.List;

public class ThreadSynchronisedBlockDemo {

   void printTable(int no) throws InterruptedException {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        synchronized (this) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(no * i);
                Thread.sleep(500);
            }
        }
       System.out.println(Thread.currentThread().getName());
       System.out.println(Thread.currentThread().getName());
   }
}
class PrintTable3 extends Thread{
    ThreadSynchronisedBlockDemo testSynchronisation;
    PrintTable3(ThreadSynchronisedBlockDemo testSynchronisation){
        this.testSynchronisation = testSynchronisation;
    }
    @Override
    public void run() {
        try {
            testSynchronisation.printTable(5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class PrintTable4 extends Thread{
    ThreadSynchronisedBlockDemo testSynchronisation;
    PrintTable4(ThreadSynchronisedBlockDemo testSynchronisation){
        this.testSynchronisation = testSynchronisation;
    }
    @Override
    public void run() {
        try {
            testSynchronisation.printTable(7);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class PrintTableImpl2{
    public static void main(String[] args) {
        ThreadSynchronisedBlockDemo testSynchronisation= new ThreadSynchronisedBlockDemo();
        PrintTable3 t1 = new PrintTable3(testSynchronisation);
        PrintTable4 t2 = new PrintTable4(testSynchronisation);

        t1.start();
        t2.start();
    }
}
