package strings;

public class Employee  {
    private Integer id;
    private String name;
    private String designation;

    public Employee(int id, String name, String designation) {
        this.id = id;
        this.name = name;
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "ID=" + id +
                ", NAME='" + name + '\'' +
                ", DESIGNATION='" + designation + '\'' +
                '}';
    }
}
class EmployeeImpl{
    public static void main(String[] args) {
        Employee e1 = new Employee(1,"Aashish","HR");
        Employee e2 = new Employee(2,"Sakshi","Jr. Developer");

        System.out.println(e1.toString());
        System.out.println(e2.toString());
    }
}
