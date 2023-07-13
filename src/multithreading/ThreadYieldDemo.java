package multithreading;

public class ThreadYieldDemo extends Thread{
    @Override
    public void run() {
        for (int i = 0;i<3;i++){
            System.out.println(Thread.currentThread().getName());

        }
    }
}
class ThreadYieldImpl{
    public static void main(String[] args) {
        ThreadYieldDemo t1 = new ThreadYieldDemo();
        ThreadYieldDemo t2 = new ThreadYieldDemo();
        t1.setName("T1");
        t2.setName("T2");
        t1.start();
        t2.start();
        for (int i=0;i<3;i++){
            t1.yield();
            System.out.println(Thread.currentThread().getName());
        }
        System.out.println(Thread.currentThread().getName());

    }

}