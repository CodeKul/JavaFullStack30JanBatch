package statickeyword;

public class Employee {
    int id;
    String name;
    static String companyName = "Codekul";

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("id "+id +" Name "+name );

    }
     static void show(){
        System.out.println(" School Name "+companyName);
    }
}
class EmployeeImpl{
    public static void main(String[] args) {
       // Employee e1 = new Employee(1,"Dharmesh");
        Employee.show();

    }
}