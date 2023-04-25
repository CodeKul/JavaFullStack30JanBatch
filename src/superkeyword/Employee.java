package superkeyword;

public class Employee {
    String regNo = "EMP-001";
    Employee(){
        System.out.println("Employee is created");
    }
    Employee(String name){
        System.out.println("Employee Name "+name);
    }
    void doWork(){
        System.out.println("Employee is working");
    }

}
class Manager extends Employee{
    String regNo = "MAN-001";
    Manager(){
       // super();
        super("abc");
        System.out.println("Manager is created");
    }
    void doWork(){
        System.out.println("Manager is working");
    }
    void display(){
        System.out.println(this.regNo);
        System.out.println(super.regNo);
        doWork();
        super.doWork();
    }
}

class EmployeeImpl{
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.display();
    }
}