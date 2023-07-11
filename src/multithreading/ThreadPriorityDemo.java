package multithreading;

public class ThreadPriorityDemo extends Thread{
    @Override
    public void run() {
        System.out.println("in running method");
        System.out.println(Thread.currentThread());
    }
}

class ThreadPriorityImpl{
    public static void main(String[] args) {
        ThreadPriorityDemo t1 = new ThreadPriorityDemo();
        ThreadPriorityDemo t2 = new ThreadPriorityDemo();
        ThreadPriorityDemo t3 = new ThreadPriorityDemo();
        t1.setPriority(6);
        t2.setPriority(5);
        t3.setPriority(9);
        t1.start();
        t2.start();
        t3.start();;
        System.out.println("Priority: "+t1.getPriority());

    }
}




















