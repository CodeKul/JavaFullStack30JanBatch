package java8;

public class ThreadDemo {
    public static void main(String[] args) {
        Runnable runnable = new Runnable(){
            @Override
            public void run() {
                System.out.println("in run");
            }
        };
        runnable.run();

    }
}
