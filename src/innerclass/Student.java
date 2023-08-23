package innerclass;

public abstract class Student {
    abstract void displayName();
}
class Employee{
    void calculate(){
        System.out.println("in calculate");
    }
}

interface Workable{
    void work();
}
class TestAnonymous1{
    public static void main(String[] args) {
        Employee employee = new Employee(){
            @Override
            void calculate() {
                System.out.println("in anonymous");
            }
        };
        employee.calculate();
        Student student = new Student(){
            @Override
            void displayName() {
                System.out.println("in display");
            }
        };
        student.displayName();

        Workable workable = new Workable(){
            @Override
            public void work() {
                System.out.println("in work");
            }
        };
        workable.work();
    }
}