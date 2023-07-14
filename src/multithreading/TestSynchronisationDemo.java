package multithreading;

public class TestSynchronisationDemo {
    synchronized void printTable(int no) throws InterruptedException {
        for (int i=1;i<=10;i++){
            System.out.println(no*i);
            Thread.sleep(500);
        }
    }
}
class PrintTable1 extends Thread{
    TestSynchronisationDemo testSynchronisation;
    PrintTable1(TestSynchronisationDemo testSynchronisation){
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

class PrintTable2 extends Thread{
    TestSynchronisationDemo testSynchronisation;
    PrintTable2(TestSynchronisationDemo testSynchronisation){
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

class PrintTableImpl{
    public static void main(String[] args) {
        TestSynchronisationDemo testSynchronisation= new TestSynchronisationDemo();

        PrintTable1 t1 = new PrintTable1(testSynchronisation);
        PrintTable2 t2 = new PrintTable2(testSynchronisation);
        t1.start();
        t2.start();
    }
}